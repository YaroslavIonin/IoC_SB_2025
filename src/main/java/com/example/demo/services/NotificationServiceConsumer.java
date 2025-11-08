package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class NotificationServiceConsumer {
    private final NotificationService notificationService;

    @Autowired
    public NotificationServiceConsumer(@Qualifier("emailService") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notify(String message) {
        notificationService.sendNotification(message);
    }
}
