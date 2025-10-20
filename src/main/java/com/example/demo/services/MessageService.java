package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    public String getMessage() {
        return "Dependency Injection through constructor!";
    }
}