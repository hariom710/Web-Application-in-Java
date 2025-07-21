package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    @JsonProperty("content")
    private String content;

    // Default constructor
    public Message() {
    }

    // Constructor with content
    public Message(String content) {
        this.content = content;
    }

    // Getter and Setter
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                '}';
    }
} 