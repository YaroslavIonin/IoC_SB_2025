package com.example.demo.services;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomService {
    private String type;
    private String createdBy;

    public void performAction() {
        System.out.println("CustomService action - Type: " + type + ", Created by: " + createdBy);
    }

}
