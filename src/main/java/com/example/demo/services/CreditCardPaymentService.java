package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
 public class CreditCardPaymentService implements PaymentService {
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }
}