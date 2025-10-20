package com.example.demo.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String getUser() {
        return "Yaroslav Ionin";
    }
}
