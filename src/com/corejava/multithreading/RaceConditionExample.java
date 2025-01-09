package com.corejava.multithreading;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
 /* A race condition occurs in a multithreaded or concurrent system when two or more threads or processes
 attempt to modify shared resources or data simultaneously, leading to unpredictable and incorrect outcomes.
 The outcome of the execution depends on the timing or sequence of thread or process execution,
 which can vary and is generally difficult to reproduce. */

public class RaceConditionExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
 /* Fixing the Race Condition
To fix the race condition, you can synchronize the increment() method, ensuring that only one thread can access it at a time */

/* Explanation:
The increment() method is now synchronized, ensuring that only one thread can execute it at a time, thus preventing race conditions.*/
