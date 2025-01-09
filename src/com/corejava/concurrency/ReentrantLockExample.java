package com.corejava.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* A ReentrantLock is a type of lock in the java.util.concurrent.locks package that allows a thread to acquire
the lock multiple times without causing a deadlock. It provides more flexibility and control compared to the synchronized keyword,
offering advanced features such as fairness, tryLock with timeout, and interruptibility.

Key Features of ReentrantLock

Reentrancy:
A thread can acquire the same lock multiple times without causing a deadlock. The lock is released when the thread
has released it as many times as it acquired it.

Fairness:
The lock can be configured to ensure fairness in acquiring the lock. When fairness is set to true, threads acquire
the lock in the order they requested it (first-come, first-served).

Interruptibility:
A thread waiting to acquire the lock can be interrupted, allowing it to respond to interrupts.

Condition Variables:
Supports condition variables using newCondition(), allowing threads to wait for specific conditions to be met before proceeding.

Try Lock:
Provides methods like tryLock() and tryLock(long timeout, TimeUnit unit) to attempt to acquire the lock without blocking indefinitely. */

public class ReentrantLockExample {
    private final Lock lock = new ReentrantLock();
    private int counter = 0;

    public void increment() {
        lock.lock();
        try {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to " + counter);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                example.increment();
            }
        };

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");

        thread1.start();
        thread2.start();
    }
}

