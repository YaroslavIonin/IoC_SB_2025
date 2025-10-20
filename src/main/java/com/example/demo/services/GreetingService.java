package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    private final MessageService messageService;

    @Autowired
    public GreetingService(MessageService messageService) {
        this.messageService = messageService;
    }

    public String greet() {
        return "Greeting: " + messageService.getMessage();
    }
}