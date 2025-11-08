package com.example.demo.services;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ServiceConfiguration {
    private String config = "Default Configuration";

    public void setConfig(String config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "ServiceConfiguration{config='" + config + "'}";
    }
}