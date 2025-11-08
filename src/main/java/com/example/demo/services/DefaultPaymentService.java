package com.example.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DefaultPaymentService implements PaymentService {
    public void processPayment() {
        System.out.println("Processing payment through DefaultPaymentService");
    }
}