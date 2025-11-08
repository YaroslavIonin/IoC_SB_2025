package com.example.demo.services;

public class ProdDatabaseService extends DatabaseService {
    @Override
    public void connect() {
        System.out.println("Connecting to PRODUCTION database...");
    }
}