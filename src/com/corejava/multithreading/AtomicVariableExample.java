package com.corejava.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/* What are Atomic variables?
In Java, atomic variables are part of the java.util.concurrent.atomic package.
These variables provide thread-safe operations on single variables without the need for explicit synchronization.
They are designed to handle concurrency issues and prevent race conditions, making them ideal for use in multi-threaded applications. */

/* Key Features of Atomic Variables
Atomicity:
Operations on atomic variables are performed as indivisible units, ensuring that they are completed without interference from other threads.

Lock-Free:
Atomic variables do not use traditional locking mechanisms like synchronized blocks or explicit locks, making them more efficient and less prone to deadlocks.

CAS (Compare-And-Swap):
Atomic variables use low-level hardware support for atomic operations, such as Compare-And-Swap (CAS), to update their values. */

/*Common Atomic Classes
AtomicInteger:
Provides atomic operations on integer values.
Example: AtomicInteger atomicInt = new AtomicInteger(0);

AtomicLong:
Provides atomic operations on long values.
Example: AtomicLong atomicLong = new AtomicLong(0L);

AtomicBoolean:
Provides atomic operations on boolean values.
Example: AtomicBoolean atomicBoolean = new AtomicBoolean(false);

AtomicReference:
Provides atomic operations on reference types.
Example: AtomicReference<String> atomicReference = new AtomicReference<>("initial value");

AtomicStampedReference:
Provides atomic operations on reference types along with a version stamp to avoid the ABA problem.
Example: AtomicStampedReference<String> atomicStampedReference = new AtomicStampedReference<>("initial value", 0);*/

public class AtomicVariableExample {
    private static final int THREADS_COUNT = 10;
    private static final AtomicInteger atomicCounter = new AtomicInteger(0);

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];

        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    atomicCounter.incrementAndGet();
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < THREADS_COUNT; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final count: " + atomicCounter.get());
    }
}

