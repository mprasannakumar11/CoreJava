package com.corejava.collections.concurrentcolletions;

import java.util.concurrent.ConcurrentLinkedQueue;

/* ConcurrentLinkedQueue is a thread-safe, unbounded, non-blocking queue based on linked nodes.
It is designed for use in concurrent programming and allows multiple threads to efficiently
access the queue without the need for explicit synchronization. */

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        // Create a ConcurrentLinkedQueue
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Adding elements to the queue
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        // Print the initial queue
        System.out.println("Initial queue: " + queue);

        // Start multiple threads to modify the queue
        Thread thread1 = new Thread(() -> {
            queue.add("date");
            System.out.println("Thread 1 added 'date': " + queue);
        });

        Thread thread2 = new Thread(() -> {
            queue.poll(); // Remove the head of the queue
            System.out.println("Thread 2 removed an element: " + queue);
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final queue
        System.out.println("Final queue: " + queue);
    }
}

