package com.corejava.collections.concurrentcolletions;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/*ConcurrentHashMap is a thread-safe implementation of the Map interface in Java.
It allows multiple threads to read and write to the map concurrently without using explicit synchronization.
Here's an example demonstrating how to use ConcurrentHashMap:*/
public class ConcurrentHashMapExample {

    public static void main(String[] args) throws IOException {

        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        // Adding elements to the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        // Print the initial map
        System.out.println("Initial map: " + map);
        // Start multiple threads to update the map
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                map.put("apple", map.get("apple") + 1);
                System.out.println("Thread 1 updated map: " + map);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                map.put("banana", map.get("banana") + 1);
                System.out.println("Thread 2 updated map: " + map);
            }
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
        // Print the final map
        System.out.println("Final map: " + map);
    }
}
