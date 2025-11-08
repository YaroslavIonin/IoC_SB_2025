package com.example.demo.services;

public class DevDatabaseService extends DatabaseService {
    @Override
    public void connect() {
        System.out.println("Connecting to DEVELOPMENT database...");
    }
}
