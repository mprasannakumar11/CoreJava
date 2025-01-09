package com.corejava.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* What is Future Object?
A Future object in Java is a part of the java.util.concurrent package and is used to represent the result of an asynchronous computation.
It acts as a placeholder for the result that will be available in the future after the computation is complete.
The Future interface provides methods to check the status of the computation, retrieve the result, and cancel the computation if needed. */

public class FutureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> callableTask = () -> {
            Thread.sleep(2000); // Simulate a long-running task
            return "Task's result";
        };

        Future<String> future = executor.submit(callableTask);

        try {
            // Perform other tasks while waiting for the result
            System.out.println("Doing other tasks...");

            // Wait for the computation to complete and retrieve the result
            String result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

