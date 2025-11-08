package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CService {
    private DService dService;

    @Autowired
    public void setDService(DService dService) {
        this.dService = dService;
    }
}