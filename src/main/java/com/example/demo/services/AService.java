package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AService {
    private BService bService;

    @Autowired
    public AService(BService bService) {
        this.bService = bService;
    }

    public void doA() {
        System.out.println("Service A is working");
        bService.doB();
    }
}