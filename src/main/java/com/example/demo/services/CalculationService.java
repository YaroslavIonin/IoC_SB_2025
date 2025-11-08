package com.example.demo.services;

import lombok.Getter;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;


@Getter
class User {
    // геттеры и сеттеры
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

@Component
public class CalculationService {

    @Cacheable("calculations")
    public int expensiveCalculation(int value) {
        System.out.println("Performing expensive calculation for: " + value);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return value * 2;
    }

    @Cacheable("users")
    public User findUserById(int id) {
        System.out.println("Fetching user from database: " + id);
        return new User(id, "User " + id);
    }

    @CacheEvict(value = "users", key = "#id")
    public void evictUserFromCache(int id) {
        System.out.println("Evicting user from cache: " + id);
    }
}