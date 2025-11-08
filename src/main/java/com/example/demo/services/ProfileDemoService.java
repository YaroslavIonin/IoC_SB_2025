package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProfileDemoService {

    private final DatabaseService databaseService;

    @Autowired
    public ProfileDemoService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public void demonstrateProfile() {
        databaseService.connect();
    }
}