package com.corejava.concurrency;

import java.util.concurrent.CountDownLatch;

/* CountDownLatch is a synchronization aid in the java.util.concurrent package that allows one or
more threads to wait until a set of operations being performed in other threads completes.
It is commonly used to manage dependencies between threads and to ensure that certain actions are only performed after
a specific number of tasks have finished.

Key Features of CountDownLatch
Count Initialization:
The CountDownLatch is initialized with a specific count, representing the number of times the countDown()
method must be invoked before threads can proceed.

Count Down:
The countDown() method decrements the count. When the count reaches zero, all waiting threads are released.

Waiting:
Threads can call the await() method to wait until the count reaches zero. This method blocks the calling
thread until the latch count is decremented to zero. */

public class CountDownLatchExample {
    public static void main(String[] args) {
        int numberOfTasks = 3;
        CountDownLatch latch = new CountDownLatch(numberOfTasks);

        // Creating and starting worker threads
        for (int i = 0; i < numberOfTasks; i++) {
            new Thread(new Worker(latch)).start();
        }

        try {
            // Main thread waits for all worker threads to complete
            latch.await();
            System.out.println("All tasks completed. Proceeding with main thread.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Worker implements Runnable {
    private final CountDownLatch latch;

    public Worker(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // Simulate task execution
            System.out.println(Thread.currentThread().getName() + " is working on a task.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Decrement the latch count
            latch.countDown();
            System.out.println(Thread.currentThread().getName() + " has finished the task.");
        }
    }
}

