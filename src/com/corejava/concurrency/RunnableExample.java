package com.corejava.concurrency;

import java.io.IOException;

/*
 * ============================================================
 * REAL-TIME EXAMPLE:
 * FOOD DELIVERY STATUS USING RUNNABLE
 * ============================================================
 *
 * Runnable is used to create a task that can run
 * in a separate thread.
 *
 * Runnable is part of:
 * -> java.lang package
 *
 * ============================================================
 * WHY RUNNABLE?
 * ============================================================
 *
 * Imagine food delivery application:
 * -> Swiggy
 * -> Zomato
 *
 * Multiple activities happen simultaneously:
 *
 * 1. Restaurant prepares food
 * 2. Delivery partner picks order
 * 3. User tracks order
 *
 * These tasks run independently using threads.
 *
 * Runnable helps execute such parallel tasks.
 *
 * ============================================================
 * IMPORTANT POINT
 * ============================================================
 *
 * Runnable:
 * 1. Does NOT return value
 * 2. Cannot throw checked exceptions directly
 * 3. Contains run() method
 */

public class RunnableExample implements Runnable {

    /*
     * ========================================================
     * run()
     * ========================================================
     *
     * This method contains task logic.
     *
     * It executes in separate thread.
     */

    @Override
    public void run() {

        /*
         * Simulating order preparation process.
         */

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    "Preparing Food Step: " + i
            );

            /*
             * Simulate delay.
             */

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

        /*
         * Task completed.
         */

        System.out.println(
                "Food preparation completed."
        );
    }



    /*
     * ========================================================
     * MAIN METHOD
     * ========================================================
     */

    public static void main(String[] args)
            throws IOException {

        /*
         * ====================================================
         * CREATE RUNNABLE OBJECT
         * ====================================================
         */

        RunnableExample foodTask =
                new RunnableExample();



        /*
         * ====================================================
         * CREATE THREAD
         * ====================================================
         *
         * Thread takes Runnable object.
         */

        Thread thread = new Thread(foodTask);



        /*
         * ====================================================
         * START THREAD
         * ====================================================
         *
         * start()
         * -------------------------
         * Creates new thread and
         * internally calls run().
         */

        thread.start();

        /*
         * Main thread continues separately.
         */

        System.out.println(
                "Customer can track order meanwhile..."
        );
    }
}

