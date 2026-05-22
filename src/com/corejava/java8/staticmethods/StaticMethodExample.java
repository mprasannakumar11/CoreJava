package com.corejava.java8.staticmethods;

/*
 * ============================================================
 * STATIC METHOD IN INTERFACE
 * ============================================================
 *
 * Introduced in:
 * -> Java 8
 *
 * Before Java 8:
 * ------------------------------------------------
 * Interfaces could contain ONLY:
 * -> abstract methods
 *
 * Java 8 introduced:
 * -> default methods
 * -> static methods
 *
 * ============================================================
 * PURPOSE OF STATIC METHODS IN INTERFACE
 * ============================================================
 *
 * Static methods are used when:
 * ------------------------------------------------
 * Method belongs to interface itself
 * NOT to implementation objects.
 *
 * Meaning:
 * ------------------------------------------------
 * Method can be called directly using:
 *
 * InterfaceName.methodName()
 *
 * No object creation needed.
 *
 * ============================================================
 * REAL-TIME EXAMPLE
 * ============================================================
 *
 * Imagine payment application:
 * ------------------------------------------------
 * -> PhonePe
 * -> Google Pay
 * -> Paytm
 *
 * All payment services need:
 * -> Common validation methods
 * -> Utility methods
 * -> Logging methods
 *
 * Such methods may not depend on objects.
 *
 * So static methods are useful.
 */


/*
 * ============================================================
 * INTERFACE
 * ============================================================
 */

interface PaymentInterface {

    /*
     * ========================================================
     * STATIC METHOD
     * ========================================================
     *
     * static method belongs to interface.
     *
     * No object required.
     *
     * Common utility:
     * ----------------------------
     * Validate payment gateway.
     */

    static void validatePaymentGateway() {

        System.out.println(
                "Payment Gateway Validated Successfully"
        );
    }
}



/*
 * ============================================================
 * IMPLEMENTATION CLASS
 * ============================================================
 */

public class StaticMethodExample
        implements PaymentInterface {

    /*
     * ========================================================
     * NORMAL INSTANCE METHOD
     * ========================================================
     *
     * Requires object creation.
     */

    void processPayment() {

        System.out.println(
                "Payment Processing Started..."
        );
    }
}



/*
 * ============================================================
 * CLIENT CODE
 * ============================================================
 */

class Main {

    public static void main(String[] args) {

        /*
         * ====================================================
         * CREATE OBJECT
         * ====================================================
         */

        StaticMethodExample payment =
                new StaticMethodExample();



        /*
         * ====================================================
         * CALL INSTANCE METHOD
         * ====================================================
         */

        payment.processPayment();



        /*
         * ====================================================
         * CALL STATIC INTERFACE METHOD
         * ====================================================
         *
         * No object creation needed.
         *
         * Called directly using:
         * InterfaceName.methodName()
         */

        PaymentInterface
                .validatePaymentGateway();
    }
}