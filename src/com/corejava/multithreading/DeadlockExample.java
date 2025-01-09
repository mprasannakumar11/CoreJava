package com.corejava.multithreading;

/* Deadlock is a situation in concurrent programming where two or more threads are blocked forever,
each waiting for the other to release a resource. This causes the program to freeze and halt progress,
as none of the threads can proceed. Deadlocks typically occur in multithreaded applications where multiple
threads need access to shared resources but obtain them in a different order.
 */
public class DeadlockExample {
    public static void main(String[] args) {
        final String resource1 = "Resource 1";
        final String resource2 = "Resource 2";

        // Thread 1 locks resource1 and then tries to lock resource2
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        // Thread 2 locks resource2 and then tries to lock resource1
        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
/* Preventing Deadlock
Deadlocks can be prevented by following these strategies:

Avoid Nested Locks:
Avoid locking multiple resources. If necessary, ensure that all threads acquire locks in the same order.

Use Timed Locks:
Use tryLock() with a timeout to acquire locks, which can help detect deadlocks.

Lock Ordering:
Establish a strict order in which locks must be acquired, preventing circular wait conditions.

Deadlock Detection:
Implement mechanisms to detect deadlocks and take corrective actions, such as forcibly releasing resources or restarting threads.
 */
