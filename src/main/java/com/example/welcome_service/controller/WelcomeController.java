package com.example.welcome_service.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class WelcomeController {

    @GetMapping("/welcome")
    public Map<String, String> welcome() {
        return Map.of("message", "Hello from Welcome Service");
    }
    
}
