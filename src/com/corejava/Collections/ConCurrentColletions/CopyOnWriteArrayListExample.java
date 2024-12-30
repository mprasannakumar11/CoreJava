package com.corejava.Collections.ConCurrentColletions;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*CopyOnWriteArrayList is a thread-safe variant of ArrayList in which all mutative operations (such as add, set, and remove)
are implemented by making a fresh copy of the underlying array.
This is particularly useful when you need to traverse a list frequently and modify it infrequently.*/

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        // Create a CopyOnWriteArrayList
        List<String> list = new CopyOnWriteArrayList<>();

        // Adding elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Print the initial list
        System.out.println("Initial list: " + list);

        // Start multiple threads to modify the list
        Thread thread1 = new Thread(() -> {
            list.add("date");
            System.out.println("Thread 1 added 'date': " + list);
        });

        Thread thread2 = new Thread(() -> {
            list.remove("banana");
            System.out.println("Thread 2 removed 'banana': " + list);
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

        // Print the final list
        System.out.println("Final list: " + list);
    }
}

