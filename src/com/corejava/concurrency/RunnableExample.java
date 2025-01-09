package com.corejava.concurrency;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableExample());
        thread.start();
    }
}

