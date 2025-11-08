package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class PaymentServiceConsumer {
    @Autowired
    private PaymentService paymentService;

    public void process() {
        paymentService.processPayment();
    }
}