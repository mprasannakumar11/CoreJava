package com.corejava.multithreading;

/* Daemon threads run in the background and do not prevent the JVM from exiting when all user threads have finished.

Set Daemon before Start: The setDaemon method must be called before the thread is started;
otherwise, it will throw an IllegalThreadStateException.

Using daemon threads can be useful for background tasks that should not block the termination of the application,
such as monitoring or cleanup tasks. */

public class DaemonThreadExample {
    public static void main(String[] args) {
        // Create a new thread
        Thread myThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Set the thread as a daemon
        myThread.setDaemon(true);

        // Start the thread
        myThread.start();

        // Main thread sleeps for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ending, daemon thread will exit now.");
    }
}

