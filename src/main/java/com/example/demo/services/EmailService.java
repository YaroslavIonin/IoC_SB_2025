package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component("emailService")
class EmailService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}
