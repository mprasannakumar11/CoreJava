package com.corejava.java8.funtionalInterface;

import java.util.function.Predicate;

/*
 * ============================================================
 * REAL-TIME EXAMPLE:
 * PAYMENT VALIDATION USING PREDICATE
 * ============================================================
 *
 * Predicate is a built-in Functional Interface.
 *
 * Package:
 * -> java.util.function
 *
 * Introduced in:
 * -> Java 8
 *
 * ============================================================
 * PURPOSE OF PREDICATE
 * ============================================================
 *
 * Predicate is used:
 * -> To check conditions
 * -> To validate data
 * -> To return TRUE or FALSE
 *
 * ============================================================
 * PREDICATE<T>
 * ============================================================
 *
 * T -> Input Type
 *
 * Return Type:
 * -> Always boolean
 *
 * Main Method:
 * -> test()
 *
 * ============================================================
 * REAL-TIME SCENARIO
 * ============================================================
 *
 * Imagine:
 * --------------------------------------
 * Payment application validates:
 *
 * -> Minimum payment amount
 * -> Transaction limit
 * -> Card validity
 * -> Account balance
 *
 * Predicate is perfect for validations.
 */

public class PredicateExample {

    public static void main(String[] args) {

        /*
         * ========================================================
         * PAYMENT VALIDATION RULE
         * ========================================================
         *
         * Condition:
         * --------------------------------
         * Payment amount must be greater
         * than or equal to 100.
         *
         * Input Type:
         * Double
         *
         * Return:
         * true / false
         */

        Predicate<Double> isValidPayment =
                amount -> amount >= 100;



        /*
         * ========================================================
         * PAYMENT 1
         * ========================================================
         */

        Double payment1 = 500.0;

        /*
         * test()
         * -------------------------
         * Evaluates condition.
         */

        System.out.println(
                "Payment Amount: "
                        + payment1
        );

        System.out.println(
                "Valid Payment: "
                        + isValidPayment.test(payment1)
        );



        /*
         * ========================================================
         * PAYMENT 2
         * ========================================================
         */

        Double payment2 = 50.0;

        System.out.println(
                "\nPayment Amount: "
                        + payment2
        );

        System.out.println(
                "Valid Payment: "
                        + isValidPayment.test(payment2)
        );
    }
}