package com.corejava.a5multithreading;

/*
 * ============================================================
 * COUNTER CLASS
 * ============================================================
 *
 * This class contains:
 * -> Shared variable count
 *
 * Shared means:
 * Multiple threads access same variable.
 */

class Counter {

    /*
     * Shared Resource
     * -------------------------
     * Both threads modify this variable.
     */

    private int count = 0;



    /*
     * synchronized METHOD
     * ========================================================
     *
     * synchronized ensures:
     * Only ONE thread can execute this method
     * at a time for the same object.
     *
     * This prevents race conditions.
     */

    public synchronized void increment() {

        /*
         * count++
         * -------------------------
         * Looks simple but internally
         * it is NOT a single operation.
         *
         * Internally:
         *
         * 1. Read count
         * 2. Add 1
         * 3. Store updated value
         *
         * Example:
         *
         * count = 5
         *
         * Step 1 -> Read 5
         * Step 2 -> Add 1 = 6
         * Step 3 -> Store 6
         */

        count++;
    }



    /*
     * Returns final count value.
     */

    public int getCount() {
        return count;
    }
}



/*
 * ============================================================
 * RACE CONDITION
 * ============================================================
 *
 * Race condition happens when:
 *
 * Multiple threads try to modify
 * shared data simultaneously.
 *
 * Result:
 * -> Incorrect output
 * -> Unpredictable behavior
 * -> Data inconsistency
 *
 * ============================================================
 * REAL-TIME EXAMPLE
 * ============================================================
 *
 * Banking Application:
 *
 * Account Balance = 1000
 *
 * Thread 1:
 * Withdraws 500
 *
 * Thread 2:
 * Withdraws 700
 *
 * If both threads access balance simultaneously:
 * -> Wrong balance may occur.
 *
 * ============================================================
 * WHY RACE CONDITION HAPPENS?
 * ============================================================
 *
 * Because threads execute independently.
 *
 * CPU decides:
 * -> Which thread runs first
 * -> When thread pauses
 * -> When another thread resumes
 *
 * Thread scheduling is unpredictable.
 */

public class RaceConditionExample {

    public static void main(String[] args) {

        /*
         * ========================================================
         * CREATE SHARED OBJECT
         * ========================================================
         *
         * Both threads use SAME counter object.
         */

        Counter counter = new Counter();



        /*
         * ========================================================
         * THREAD 1
         * ========================================================
         *
         * Increments count 1000 times.
         */

        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {

                /*
                 * Shared resource modification.
                 */

                counter.increment();
            }
        });



        /*
         * ========================================================
         * THREAD 2
         * ========================================================
         *
         * Also increments same count 1000 times.
         */

        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {

                counter.increment();
            }
        });



        /*
         * ========================================================
         * START THREADS
         * ========================================================
         *
         * start()
         * ----------------------
         * Creates separate execution paths.
         *
         * Both threads execute concurrently.
         */

        t1.start();
        t2.start();



        /*
         * ========================================================
         * WAIT FOR THREADS
         * ========================================================
         *
         * join()
         * ----------------------
         * Main thread waits until
         * both threads finish execution.
         */

        try {

            t1.join();
            t2.join();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }



        /*
         * ========================================================
         * FINAL OUTPUT
         * ========================================================
         *
         * Expected:
         *
         * Thread 1 -> 1000 increments
         * Thread 2 -> 1000 increments
         *
         * Total:
         * 2000
         */

        System.out.println(
                "Final count: "
                        + counter.getCount());
    }
}