package com.corejava.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/* CompletableFuture is a class in Java that is part of the java.util.concurrent package.
It represents a Future that can be explicitly completed, and it provides a number of methods to compose, combine,
and handle asynchronous operations in a more flexible and readable manner.
It was introduced in Java 8 to address some limitations of the Future interface and to provide better support for asynchronous programming. */

public class CompletableFutureExample {
    public static void main(String[] args) {
        // Create a CompletableFuture that completes after a computation
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); // Simulate a long-running task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, World!";
        });

        // Chain another computation that depends on the first one
        CompletableFuture<String> resultFuture = future.thenApplyAsync(result -> result + " - CompletableFuture");

        try {
            // Get the result of the computation
            String result = resultFuture.get();
            System.out.println(result); // Outputs: Hello, World! - CompletableFuture
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

