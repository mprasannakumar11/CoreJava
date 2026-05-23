package com.corejava.java21;

/*
 * ============================================================
 * STRING TEMPLATES - JAVA 21
 * ============================================================
 *
 * Introduced as Preview Feature in Java 21.
 *
 * ============================================================
 * PURPOSE
 * ============================================================
 *
 * Makes String creation:
 *
 * -> cleaner
 * -> readable
 * -> safer
 *
 * Similar to:
 *
 * -> JavaScript template literals
 * -> Python f-strings
 * -> Kotlin string templates
 *
 * ============================================================
 * BEFORE STRING TEMPLATES
 * ============================================================
 *
 * String concatenation was messy.
 *
 * Example:
 *
 * String message =
 *      "Payment by " + customerName +
 *      " amount " + amount;
 *
 * Problems:
 *
 * -> difficult readability
 * -> too many +
 * -> error-prone
 *
 * ============================================================
 * JAVA 21 STRING TEMPLATE SOLUTION
 * ============================================================
 *
 * Java introduced:
 *
 * -> STR template processor
 *
 * Syntax:
 *
 * STR."text \{expression}"
 *
 * ============================================================
 * IMPORTANT
 * ============================================================
 *
 * String Templates are PREVIEW feature.
 *
 * Need compiler flag:
 *
 * --enable-preview
 *
 * ============================================================
 * REAL-TIME EXAMPLE
 * ============================================================
 *
 * Payment application generating:
 *
 * -> payment messages
 * -> invoice messages
 * -> OTP messages
 * -> transaction alerts
 */


/*
 * ============================================================
 * IMPORTS
 * ============================================================
 */

import static java.lang.StringTemplate.STR;


/*
 * ============================================================
 * MAIN CLASS
 * ============================================================
 */

public class StringTemplatesExample {

    public static void main(String[] args) {

        /*
         * ====================================================
         * PAYMENT DETAILS
         * ====================================================
         */

        String customerName = "Prasanna";

        double amount = 7500;

        String paymentMethod = "UPI";


        /*
         * ====================================================
         * OLD STYLE STRING CONCATENATION
         * ====================================================
         */

        String oldMessage =
                "Payment received from "
                        + customerName
                        + " using "
                        + paymentMethod
                        + " for amount Rs."
                        + amount;

        System.out.println("Old Style");

        System.out.println(oldMessage);


        /*
         * ====================================================
         * STRING TEMPLATE
         * ====================================================
         *
         * \{expression}
         *
         * Java evaluates expression automatically.
         */

        String newMessage = STR."""
                Payment received from \{customerName}
                using \{paymentMethod}
                for amount Rs.\{amount}
                """;


        System.out.println("\nString Template");

        System.out.println(newMessage);
    }
}
