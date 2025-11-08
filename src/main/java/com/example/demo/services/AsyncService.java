package com.example.demo.services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class AsyncService {

    @Async
    public void performAsyncTask() {
        System.out.println("Performing async task in thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Async task completed");
    }

    @Async
    public CompletableFuture<String> performAsyncTaskWithResult() {
        System.out.println("Performing async task with result in thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return CompletableFuture.completedFuture("Async task result");
    }
}