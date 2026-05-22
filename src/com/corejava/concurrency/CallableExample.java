package com.corejava.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * ============================================================
 * REAL-TIME EXAMPLE:
 * PAYMENT STATUS CHECK USING CALLABLE
 * ============================================================
 *
 * Imagine:
 * -----------------------------------
 * A payment application like:
 * -> PhonePe
 * -> Google Pay
 * -> Paytm
 *
 * User makes payment.
 *
 * Backend service checks:
 * -> Payment success?
 * -> Transaction ID?
 * -> Bank response?
 *
 * This operation may take time because:
 * -> Network calls
 * -> Bank server communication
 * -> Database validation
 *
 * So we run task asynchronously using:
 * -> Callable
 *
 * ============================================================
 * WHY CALLABLE?
 * ============================================================
 *
 * Runnable:
 * -------------------
 * 1. Does NOT return result
 * 2. Cannot throw checked exceptions
 *
 * Callable:
 * -------------------
 * 1. Returns result
 * 2. Can throw exceptions
 *
 * Method:
 * -------------------
 * call()
 *
 * Similar to:
 * run()
 *
 * But returns value.
 */

public class CallableExample implements Callable<String> {

    /*
     * ========================================================
     * call()
     * ========================================================
     *
     * This method executes in separate thread.
     *
     * Return Type:
     * String
     */

    @Override
    public String call() throws Exception {

        /*
         * Simulating payment processing delay.
         *
         * Example:
         * Bank server communication.
         */

        System.out.println(
                "Payment processing started..."
        );

        Thread.sleep(3000);

        /*
         * Simulated payment response.
         */

        String transactionId = "TXN12345";

        /*
         * Returning payment result.
         */

        return "Payment Successful | Transaction ID: "
                + transactionId;
    }



    /*
     * ========================================================
     * MAIN METHOD
     * ========================================================
     */

    public static void main(String[] args) {

        /*
         * ====================================================
         * CREATE THREAD POOL
         * ====================================================
         *
         * ExecutorService manages threads.
         *
         * newSingleThreadExecutor()
         * -----------------------------
         * Creates only one worker thread.
         */

        ExecutorService executor =
                Executors.newSingleThreadExecutor();



        /*
         * ====================================================
         * SUBMIT CALLABLE TASK
         * ====================================================
         *
         * submit()
         * -----------------------------
         * Executes Callable task.
         *
         * Returns:
         * Future object
         */

        Future<String> future =
                executor.submit(
                        new CallableExample()
                );



        /*
         * Main thread continues execution.
         */

        System.out.println(
                "Main thread continues working..."
        );



        /*
         * ====================================================
         * GET RESULT
         * ====================================================
         *
         * future.get()
         * -----------------------------
         * Waits until task completes.
         *
         * Then returns result from call().
         */

        try {

            String result = future.get();

            /*
             * Print payment result.
             */

            System.out.println(result);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            /*
             * =================================================
             * SHUTDOWN EXECUTOR
             * =================================================
             *
             * Releases thread resources.
             */

            executor.shutdown();
        }
    }
}
