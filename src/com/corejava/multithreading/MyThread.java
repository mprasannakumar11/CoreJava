package com.corejava.multithreading;

public class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();

        thread.start();

        MyThread.sleep(1000);

        System.out.println("Current Thread: " + MyThread.currentThread());
        System.out.println("Active Count: " + MyThread.activeCount());


    }
}
