package com.example.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigService {

    @Value("${app.name:DefaultApp}")
    private String appName;

    @Value("${app.version:1.0}")
    private String appVersion;

    public void displayConfig() {
        System.out.println("App Name: " + appName);
        System.out.println("App Version: " + appVersion);
    }
}