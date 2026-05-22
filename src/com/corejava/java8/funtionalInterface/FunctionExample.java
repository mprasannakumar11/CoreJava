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

        /*
         * ========================================================
         * FUNCTION OBJECT
         * ========================================================
         *
         * Input:
         * Product price
         *
         * Output:
         * Price after 10% discount
         */

        Function<Double, Double> applyDiscount =
                price -> price - (price * 0.10);



        /*
         * ========================================================
         * PRODUCT 1
         * ========================================================
         */

        Double laptopPrice = 50000.0;

        Double finalLaptopPrice =
                applyDiscount.apply(laptopPrice);

        System.out.println(
                "Laptop Original Price: "
                        + laptopPrice
        );

        System.out.println(
                "Laptop Final Price: "
                        + finalLaptopPrice
        );



        /*
         * ========================================================
         * PRODUCT 2
         * ========================================================
         */

        Double mobilePrice = 20000.0;

        Double finalMobilePrice =
                applyDiscount.apply(mobilePrice);

        System.out.println(
                "\nMobile Original Price: "
                        + mobilePrice
        );

        System.out.println(
                "Mobile Final Price: "
                        + finalMobilePrice
        );
    }
}
