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

        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7));
    }
}