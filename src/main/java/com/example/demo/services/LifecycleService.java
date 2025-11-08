package com.example.demo.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleService {

    @PostConstruct
    public void init() {
        System.out.println("Bean initialized - PostConstruct");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Bean destroyed - PreDestroy");
    }

    public void performAction() {
        System.out.println("Performing action...");
    }
}
