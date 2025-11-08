package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.services.DatabaseService;

@Configuration
public class AppConfig {

    @Bean
    public DatabaseService databaseService() {
        return new DatabaseService();
    }
}