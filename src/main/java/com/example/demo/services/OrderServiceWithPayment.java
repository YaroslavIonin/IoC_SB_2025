package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceWithPayment {
    private final PaymentService paymentService;

    @Autowired
    public OrderServiceWithPayment(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void checkout() {
        paymentService.processPayment();
    }
}
