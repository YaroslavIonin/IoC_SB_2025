package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component("smsService")
class SmsService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}