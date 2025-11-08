package com.example.demo.config;

import com.example.demo.services.DatabaseService;
import com.example.demo.services.DevDatabaseService;
import com.example.demo.services.ProdDatabaseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DatabaseService devDatabaseService() {
        System.out.println("Creating DEV database service");
        return new DevDatabaseService();
    }

    @Bean
    @Profile("prod")
    public DatabaseService prodDatabaseService() {
        System.out.println("Creating PROD database service");
        return new ProdDatabaseService();
    }
}