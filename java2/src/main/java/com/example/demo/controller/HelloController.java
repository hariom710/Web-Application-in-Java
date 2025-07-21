package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    private List<Message> messages = new ArrayList<>();

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/messages")
    public ResponseEntity<List<Message>> getMessages() {
        return ResponseEntity.ok(messages);
    }

    @PostMapping("/messages")
    public ResponseEntity<Message> addMessage(@RequestBody Message message) {
        if (message != null && message.getContent() != null) {
            messages.add(message);
            return ResponseEntity.ok(message);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/messages/{index}")
    public ResponseEntity<Message> getMessage(@PathVariable int index) {
        if (index >= 0 && index < messages.size()) {
            return ResponseEntity.ok(messages.get(index));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/messages/{index}")
    public ResponseEntity<String> deleteMessage(@PathVariable int index) {
        if (index >= 0 && index < messages.size()) {
            messages.remove(index);
            return ResponseEntity.ok("Message deleted successfully");
        }
        return ResponseEntity.notFound().build();
    }
} 