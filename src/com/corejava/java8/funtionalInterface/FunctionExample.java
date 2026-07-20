package com.corejava.java8.funtionalInterface;

import java.util.function.Function;

/*
 * ============================================================
 * REAL-TIME EXAMPLE:
 * ONLINE SHOPPING DISCOUNT CALCULATION
 * ============================================================
 *
 * Imagine:
 * -------------------------------------
 * Amazon / Flipkart application.
 *
 * Product price entered by user.
 *
 * Function interface used to:
 * -> Process price
 * -> Apply discount
 * -> Return final price
 *
 * ============================================================
 * FUNCTION<T, R>
 * ============================================================
 *
 * T -> Input Type
 * R -> Return Type
 *
 * Here:
 *
 * Function<Double, Double>
 *
 * Input:
 * Product Price
 *
 * Output:
 * Final Discounted Price
 */

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> length = str -> str.length();

        System.out.println(length.apply("Spring"));
    }
}
