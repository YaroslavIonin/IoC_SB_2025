package com.example.demo.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public String getOrderInfo() {
        return "Order №1!";
    }
}
