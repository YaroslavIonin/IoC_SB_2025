package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DService {
    private CService cService;

    @Autowired
    public void setCService(CService cService) {
        this.cService = cService;
    }
}