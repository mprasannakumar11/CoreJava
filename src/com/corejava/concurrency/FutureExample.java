package com.corejava.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* What is Future Object?
A Future object in Java is a part of the java.util.concurrent package and is used to represent the result of an asynchronous computation.
It acts as a placeholder for the result that will be available in the future after the computation is complete.
The Future interface provides methods to check the status of the computation, retrieve the result, and cancel the computation if needed. */

/*
 * ============================================================
 * REAL-TIME EXAMPLE:
 * PAYMENT STATUS CHECK USING FUTURE
 * ============================================================
 *
 * Imagine:
 * ------------------------------------------------
 * User makes payment in:
 * -> PhonePe
 * -> Google Pay
 * -> Paytm
 *
 * Payment processing takes time because:
 * -> Bank server validation
 * -> Fraud checks
 * -> Database updates
 * -> Network communication
 *
 * Instead of blocking the application,
 * payment processing happens in background.
 *
 * Future helps retrieve result later.
 *
 * ============================================================
 * WHAT IS FUTURE?
 * ============================================================
 *
 * Future represents:
 * -> Future result of asynchronous task.
 *
 * Meaning:
 * Task is running now,
 * result will be available later.
 *
 * Future works with:
 * -> Callable
 * -> ExecutorService
 *
 * ============================================================
 * IMPORTANT METHODS
 * ============================================================
 *
 * future.get()
 * -------------------------
 * Waits and retrieves result.
 *
 * future.isDone()
 * -------------------------
 * Checks task completed or not.
 *
 * future.cancel()
 * -------------------------
 * Cancels task execution.
 */

public class FutureExample {

    public static void main(String[] args) {

        /*
         * ========================================================
         * CREATE THREAD POOL
         * ========================================================
         *
         * ExecutorService manages threads.
         */

        ExecutorService executor =
                Executors.newSingleThreadExecutor();


        /*
         * ========================================================
         * PAYMENT PROCESSING TASK
         * ========================================================
         *
         * Callable:
         * -> Returns result
         * -> Can throw exceptions
         */

        Callable<String> paymentTask = () -> {

            /*
             * Payment processing started.
             */

            System.out.println(
                    "Payment processing started..."
            );



            /*
             * Simulating bank processing delay.
             */

            Thread.sleep(2000);



            /*
             * Simulated transaction ID.
             */

            String transactionId = "TXN987654";



            /*
             * Return payment result.
             */

            return "Payment Successful | "
                    + "Transaction ID: "
                    + transactionId;
        };



        /*
         * ========================================================
         * SUBMIT TASK
         * ========================================================
         *
         * submit()
         * -------------------------
         * Executes task asynchronously.
         *
         * Returns:
         * Future object
         */

        Future<String> future =
                executor.submit(paymentTask);



        try {

            /*
             * ====================================================
             * MAIN THREAD CONTINUES WORKING
             * ====================================================
             *
             * Application can continue other work
             * while payment is processing.
             */

            System.out.println(
                    "User is viewing payment screen..."
            );

            System.out.println(
                    "Loading transaction details..."
            );



            /*
             * ====================================================
             * GET RESULT
             * ====================================================
             *
             * future.get()
             * -------------------------
             * Waits until task completes.
             *
             * Returns result from Callable.
             */

            String result = future.get();



            /*
             * Print final payment status.
             */

            System.out.println(
                    "Result: " + result
            );

        } catch (InterruptedException
                 | ExecutionException e) {

            e.printStackTrace();

        } finally {

            /*
             * ====================================================
             * SHUTDOWN EXECUTOR
             * ====================================================
             */

            executor.shutdown();
        }
    }
}

