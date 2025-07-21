package com.example.payroll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Employee Payroll Service!\n\n" +
               "Available endpoints:\n" +
               "GET    /api/employees     - Get all employees\n" +
               "GET    /api/employees/{id} - Get employee by ID\n" +
               "POST   /api/employees     - Create new employee\n" +
               "PUT    /api/employees/{id} - Update employee\n" +
               "DELETE /api/employees/{id} - Delete employee\n\n" +
               "H2 Console: http://localhost:8080/h2-console";
    }
} 