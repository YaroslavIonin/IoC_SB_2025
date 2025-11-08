package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MethodInjectionService {

    private ServiceConfiguration configuration;

    @Autowired
    public void configureService(ServiceConfiguration configuration) {
        this.configuration = configuration;
        System.out.println("Service configured with: " + configuration);
    }

    public void performAction() {
        System.out.println("Performing action with config: " + configuration.getConfig());
    }
}