package com.corejava.Collections.ConCurrentColletions;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/*The CopyOnWriteArraySet class in Java is a thread-safe variant of Set that uses a CopyOnWriteArrayList for all of its operations.
This means that every time a modification is made, a new copy of the array is created.
It is particularly useful when you need to traverse a set frequently and modify it infrequently.*/

public class CopyOnWriteArraySetExample {
    public static void main(String[] args) {
        // Create a CopyOnWriteArraySet
        Set<String> set = new CopyOnWriteArraySet<>();

        // Adding elements to the set
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Print the initial set
        System.out.println("Initial set: " + set);

        // Start multiple threads to modify the set
        Thread thread1 = new Thread(() -> {
            set.add("date");
            System.out.println("Thread 1 added 'date': " + set);
        });

        Thread thread2 = new Thread(() -> {
            set.remove("banana");
            System.out.println("Thread 2 removed 'banana': " + set);
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

        // Print the final set
        System.out.println("Final set: " + set);
    }
}
