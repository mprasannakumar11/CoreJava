package com.corejava.multithreading;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Running ....");
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();

        Thread t1 = new Thread(myRunnable);

        t1.run();

        Thread.sleep(1000);

        System.out.println("Current ActiveCount: " + Thread.activeCount());
    }
}
