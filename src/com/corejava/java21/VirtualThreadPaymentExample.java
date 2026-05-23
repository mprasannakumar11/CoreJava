package com.corejava.java21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * ============================================================
 * JAVA 21 - VIRTUAL THREADS
 * ============================================================
 *
 * Introduced:
 * ------------------------------------------------
 * Preview in Java 19
 * Final in Java 21
 *
 * ============================================================
 * WHAT ARE VIRTUAL THREADS?
 * ============================================================
 *
 * Virtual Threads are:
 * ------------------------------------------------
 * Lightweight threads managed by JVM.
 *
 * They are NOT directly mapped
 * one-to-one with OS threads.
 *
 * Traditional Threads:
 * ------------------------------------------------
 * One Java Thread =
 * One OS Thread
 *
 * Virtual Threads:
 * ------------------------------------------------
 * Thousands or even millions of virtual threads
 * can run using very few OS threads.
 *
 * ============================================================
 * WHY IMPORTANT?
 * ============================================================
 *
 * Traditional platform threads are expensive:
 * ------------------------------------------------
 * -> More memory usage
 * -> Context switching cost
 * -> Limited scalability
 *
 * Virtual Threads are lightweight:
 * ------------------------------------------------
 * -> Less memory
 * -> Massive scalability
 * -> Better for I/O operations
 *
 * ============================================================
 * REAL-TIME EXAMPLE
 * ============================================================
 *
 * Payment Application:
 * ------------------------------------------------
 * Imagine:
 * -> PhonePe
 * -> Google Pay
 * -> Paytm
 *
 * Thousands of users make payments simultaneously.
 *
 * Each payment request:
 * ------------------------------------------------
 * -> Calls bank API
 * -> Waits for response
 * -> Updates database
 *
 * Waiting operations waste traditional threads.
 *
 * Virtual threads solve this efficiently.
 */

public class VirtualThreadPaymentExample {

    public static void main(String[] args) {

        /*
         * ========================================================
         * CREATE VIRTUAL THREAD EXECUTOR
         * ========================================================
         *
         * Java 21 provides:
         *
         * Executors.newVirtualThreadPerTaskExecutor()
         *
         * Meaning:
         * ------------------------------------------------
         * Every submitted task gets its own virtual thread.
         *
         * JVM manages them efficiently.
         */

        ExecutorService executorService =
                Executors.newVirtualThreadPerTaskExecutor();


        /*
         * ========================================================
         * SIMULATING MULTIPLE PAYMENTS
         * ========================================================
         *
         * 10 payment requests.
         */

        for (int i = 1; i <= 10; i++) {

            /*
             * Local variable for lambda.
             */

            int paymentId = i;


            /*
             * ====================================================
             * SUBMIT PAYMENT TASK
             * ====================================================
             *
             * Each task runs in separate
             * virtual thread.
             */

            executorService.submit(
                    () -> processPayment(paymentId)
            );
        }


        /*
         * ========================================================
         * SHUTDOWN EXECUTOR
         * ========================================================
         *
         * Prevents new task submissions.
         */

        executorService.shutdown();
    }


    /*
     * ============================================================
     * PAYMENT PROCESSING METHOD
     * ============================================================
     */

    private static void processPayment(int paymentId) {

        /*
         * ========================================================
         * CURRENT THREAD DETAILS
         * ========================================================
         *
         * Thread.currentThread()
         * shows:
         * -> Virtual thread information
         */

        System.out.println(
                "Processing payment "
                        + paymentId
                        + " by thread: "
                        + Thread.currentThread()
        );


        try {

            /*
             * ====================================================
             * SIMULATING EXTERNAL API CALL
             * ====================================================
             *
             * Examples:
             * ------------------------------------------------
             * -> Bank API
             * -> UPI gateway
             * -> Fraud detection service
             *
             * Thread waits for 2 seconds.
             */

            Thread.sleep(2000);


            /*
             * ====================================================
             * PAYMENT SUCCESS
             * ====================================================
             */

            System.out.println(
                    "Payment completed: "
                            + paymentId +
                            " by thread: " + Thread.currentThread());

        } catch (InterruptedException e) {

            /*
             * ====================================================
             * RESTORE INTERRUPT STATUS
             * ====================================================
             */

            Thread.currentThread().interrupt();


            /*
             * ====================================================
             * HANDLE INTERRUPTED PAYMENT
             * ====================================================
             */

            System.out.println("Payment interrupted: " + paymentId);
        }
    }
}
