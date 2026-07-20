package com.corejava.java21;

/*
 * ============================================================
 * UNNAMED PATTERNS AND VARIABLES - JAVA 21
 * ============================================================
 *
 * Introduced as Preview Feature in Java 21.
 *
 * ============================================================
 * PURPOSE
 * ============================================================
 *
 * Sometimes we do NOT need:
 *
 * -> variable names
 * -> unused parameters
 * -> unused pattern values
 *
 * Before Java 21:
 *
 * We were forced to create variables
 * even if not used.
 *
 * Java 21 introduced:
 *
 * -> underscore (_)
 *
 * to represent:
 *
 * -> ignored variables
 * -> ignored pattern values
 *
 * ============================================================
 * BENEFITS
 * ============================================================
 *
 * -> cleaner code
 * -> avoids unnecessary variables
 * -> improves readability
 * -> makes intent clear
 *
 * ============================================================
 * REAL-TIME EXAMPLE
 * ============================================================
 *
 * Payment processing system.
 *
 * Sometimes we only need:
 *
 * -> payment amount
 *
 * and don't care about:
 *
 * -> transaction id
 * -> customer name
 */


/*
 * ============================================================
 * PAYMENT RECORD
 * ============================================================
 */

record Payment(String transactionId,
               String customerName,
               double amount) {}


/*
 * ============================================================
 * MAIN CLASS
 * ============================================================
 */

public class UnnamedPatternsExample {

    public static void main(String[] args) {

        Object payment =
                new Payment(
                        "TXN1001",
                        "Prasanna",
                        12000
                );


        /*
         * ====================================================
         * RECORD PATTERN WITH UNUSED VALUES
         * ====================================================
         *
         * We only need:
         * -> amount
         *
         * Ignore:
         * -> transactionId
         * -> customerName
         */

       /* if (payment instanceof Payment(_, _, double amount)) {

            System.out.println("Payment Amount : " + amount);
        }*/
    }
}