package com.corejava.Collections.ConCurrentColletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

/* The Collections class in Java provides a set of methods for creating synchronized (thread-safe) collections.
These methods return synchronized views of the specified collections,
which can help to ensure that the collections are safely accessed by multiple threads. */

public class SynchronizedCollectionsExample {
    public static void main(String[] args) {
        // Create a non-synchronized list
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Create a synchronized (thread-safe) list
        List<String> synchronizedList = Collections.synchronizedList(list);

        // Start multiple threads to modify the synchronized list
        Thread thread1 = new Thread(() -> {
            synchronizedList.add("date");
            System.out.println("Thread 1 added 'date': " + synchronizedList);
        });

        Thread thread2 = new Thread(() -> {
            synchronizedList.remove("banana");
            System.out.println("Thread 2 removed 'banana': " + synchronizedList);
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

        // Iterate over the synchronized list
        synchronized (synchronizedList) {
            Iterator<String> iterator = synchronizedList.iterator();
            while (iterator.hasNext()) {
                System.out.println("Element: " + iterator.next());
            }
        }
    }
}
