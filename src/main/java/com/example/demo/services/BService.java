package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BService {
    private AService aService;

    @Autowired
    public BService(AService aService) {
        this.aService = aService;
    }

    public void doB() {
        System.out.println("Service B is working");
    }
}