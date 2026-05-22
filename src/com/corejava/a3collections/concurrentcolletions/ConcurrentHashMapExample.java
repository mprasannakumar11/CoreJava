package com.corejava.a3collections.concurrentcolletions;

import java.util.concurrent.ConcurrentHashMap;

/*
 * ============================================================
 * REAL-TIME EXAMPLE:
 * PAYMENT TRANSACTION COUNTER
 * ============================================================
 *
 * Imagine an online payment application like:
 * -> PhonePe
 * -> Google Pay
 * -> Paytm
 * -> Banking System
 *
 * Multiple users make payments simultaneously.
 *
 * Example:
 * --------------------------------
 * User 1 pays using UPI
 * User 2 pays using Credit Card
 * User 3 pays using Net Banking
 *
 * Multiple threads update payment counts concurrently.
 *
 * If normal HashMap is used:
 * -> Data inconsistency may happen
 * -> Some transactions may be lost
 *
 * So ConcurrentHashMap is used.
 */

public class ConcurrentHashMapExample {

    public static void main(String[] args)
            throws InterruptedException {

        /*
         * ========================================================
         * CREATE THREAD-SAFE PAYMENT MAP
         * ========================================================
         *
         * Key   -> Payment Method
         * Value -> Total Transactions Count
         */

        ConcurrentHashMap<String, Integer> paymentMap =
                new ConcurrentHashMap<>();


        /*
         * ========================================================
         * INITIAL PAYMENT COUNTS
         * ========================================================
         */

        paymentMap.put("UPI", 100);
        paymentMap.put("CreditCard", 50);
        paymentMap.put("NetBanking", 30);

        /*
         * Initial Payment Data
         */

        System.out.println(
                "Initial Payment Data: "
                        + paymentMap);



        /*
         * ========================================================
         * THREAD 1
         * ========================================================
         *
         * Simulates UPI payments happening
         * from multiple customers.
         */

        Thread upiThread = new Thread(() -> {

            /*
             * 5 new UPI payments received.
             */

            for (int i = 1; i <= 5; i++) {

                /*
                 * compute()
                 * --------------------------
                 * Atomically updates value.
                 *
                 * Safe for concurrent updates.
                 */

                paymentMap.compute(
                        "UPI",
                        (key, value) -> value + 1
                );

                System.out.println(
                        "UPI Payment Processed: "
                                + paymentMap);

                /*
                 * Small delay for understanding.
                 */

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });



        /*
         * ========================================================
         * THREAD 2
         * ========================================================
         *
         * Simulates Credit Card payments.
         */

        Thread cardThread = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                paymentMap.compute(
                        "CreditCard",
                        (key, value) -> value + 1
                );

                System.out.println(
                        "Card Payment Processed: "
                                + paymentMap);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });



        /*
         * ========================================================
         * THREAD 3
         * ========================================================
         *
         * Simulates Net Banking payments.
         */

        Thread bankingThread = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                paymentMap.compute(
                        "NetBanking",
                        (key, value) -> value + 1
                );

                System.out.println(
                        "Net Banking Payment Processed: "
                                + paymentMap);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });



        /*
         * ========================================================
         * START ALL THREADS
         * ========================================================
         */

        upiThread.start();
        cardThread.start();
        bankingThread.start();



        /*
         * ========================================================
         * WAIT FOR ALL THREADS
         * ========================================================
         */

        upiThread.join();
        cardThread.join();
        bankingThread.join();



        /*
         * ========================================================
         * FINAL PAYMENT COUNTS
         * ========================================================
         *
         * UPI:
         * 100 + 5 = 105
         *
         * CreditCard:
         * 50 + 5 = 55
         *
         * NetBanking:
         * 30 + 5 = 35
         */

        System.out.println(
                "\nFinal Payment Summary: "
                        + paymentMap);
    }
}