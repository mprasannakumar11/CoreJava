package com.corejava.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/* A CyclicBarrier is a synchronization aid in the java.util.concurrent package that allows a set of threads to all wait for
each other to reach a common barrier point. The barrier is called "cyclic" because it can be reused after the waiting threads are released,
making it useful for scenarios where multiple sets of threads need to coordinate at various points during execution.

Key Features of CyclicBarrier
Barrier Point:

A point at which all threads must wait before any of them can proceed.
The number of threads that must wait at the barrier is specified during the creation of the CyclicBarrier.

Reusability:
Unlike CountDownLatch, which is a one-time use mechanism, CyclicBarrier can be reused after the waiting threads are released,
making it suitable for cyclic phases of execution.

Optional Barrier Action:
A Runnable action can be specified during the creation of the CyclicBarrier,
which will be executed once all threads have reached the barrier point. */

public class CyclicBarrierExample {
    public static void main(String[] args) {
        int numberOfThreads = 3;
        CyclicBarrier barrier = new CyclicBarrier(numberOfThreads, () -> {
            System.out.println("All parties have reached the barrier. Barrier is now reset.");
        });

        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(new Task(barrier)).start();
        }
    }
}

class Task implements Runnable {
    private final CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier.");

            // Simulate some work after crossing the barrier
            Thread.sleep(1000);

            // Wait at the barrier again
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier again.");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier again.");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

