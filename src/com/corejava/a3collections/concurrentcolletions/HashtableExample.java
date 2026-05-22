package com.corejava.a3collections.concurrentcolletions;

import java.util.Hashtable;

/*
 * ============================================================
 * HASHTABLE EXAMPLE
 * ============================================================
 *
 * Hashtable is a legacy class in Java.
 *
 * Package:
 * java.util
 *
 * Hashtable stores:
 * -> Key-Value pairs
 *
 * Similar to HashMap,
 * but Hashtable is thread-safe.
 *
 * ============================================================
 * IMPORTANT FEATURES
 * ============================================================
 *
 * 1. Thread-safe
 * 2. Synchronized methods
 * 3. No null keys allowed
 * 4. No null values allowed
 * 5. Slower than ConcurrentHashMap
 *
 * ============================================================
 * HOW THREAD-SAFETY WORKS?
 * ============================================================
 *
 * Hashtable locks entire table
 * for every operation.
 *
 * Example:
 * ----------------------------
 * Thread 1 accessing map
 *
 * Other threads must wait.
 *
 * Because whole map is locked.
 *
 * ============================================================
 * PERFORMANCE PROBLEM
 * ============================================================
 *
 * Since entire map is locked:
 *
 * -> Less concurrency
 * -> Slower performance
 * -> Threads wait frequently
 *
 * This is why ConcurrentHashMap
 * is preferred in modern applications.
 */

public class HashtableExample {

    public static void main(String[] args)
            throws InterruptedException {

        /*
         * ========================================================
         * CREATE HASHTABLE
         * ========================================================
         */

        Hashtable<String, Integer> paymentTable =
                new Hashtable<>();



        /*
         * ========================================================
         * ADD INITIAL DATA
         * ========================================================
         */

        paymentTable.put("UPI", 100);
        paymentTable.put("CreditCard", 50);
        paymentTable.put("NetBanking", 30);

        /*
         * Nulls NOT allowed
         */

        // paymentTable.put(null, 10); // Exception
        // paymentTable.put("Wallet", null); // Exception

        System.out.println(
                "Initial Payment Table: "
                        + paymentTable);



        /*
         * ========================================================
         * THREAD 1
         * ========================================================
         *
         * Simulates UPI payments.
         */

        Thread thread1 = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                /*
                 * Read current value
                 */

                int currentValue =
                        paymentTable.get("UPI");

                /*
                 * Update value
                 */

                paymentTable.put(
                        "UPI",
                        currentValue + 1
                );

                System.out.println(
                        "Thread 1 Updated: "
                                + paymentTable);

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

        Thread thread2 = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                int currentValue =
                        paymentTable.get("CreditCard");

                paymentTable.put(
                        "CreditCard",
                        currentValue + 1
                );

                System.out.println(
                        "Thread 2 Updated: "
                                + paymentTable);

                try {

                    Thread.sleep(500);

                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        });



        /*
         * ========================================================
         * START THREADS
         * ========================================================
         */

        thread1.start();
        thread2.start();



        /*
         * ========================================================
         * WAIT FOR THREADS
         * ========================================================
         */

        thread1.join();
        thread2.join();



        /*
         * ========================================================
         * FINAL OUTPUT
         * ========================================================
         */

        System.out.println(
                "\nFinal Payment Table: "
                        + paymentTable);
    }
}
