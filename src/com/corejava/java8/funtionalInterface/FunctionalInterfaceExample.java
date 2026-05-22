package com.corejava.java8.funtionalInterface;

/*
 * ============================================================
 * FUNCTIONAL INTERFACE - DETAILED EXPLANATION
 * ============================================================
 *
 * Functional Interface means:
 * ------------------------------------------------
 * Interface containing ONLY ONE abstract method.
 *
 * Introduced in:
 * -> Java 8
 *
 * Main Purpose:
 * ------------------------------------------------
 * Used with:
 * -> Lambda Expressions
 * -> Method References
 * -> Stream API
 *
 * ============================================================
 * YOUR EXAMPLE
 * ============================================================
 */


/*
 * ============================================================
 * @FunctionalInterface
 * ============================================================
 *
 * This annotation tells compiler:
 *
 * "This interface MUST contain
 * exactly ONE abstract method."
 *
 * Benefits:
 * ------------------------------------------------
 * 1. Improves readability
 * 2. Compiler validation
 * 3. Prevents mistakes
 *
 * If multiple abstract methods added:
 * -> Compilation error occurs
 */

@FunctionalInterface
interface FuntionalInterface {

    /*
     * ========================================================
     * SINGLE ABSTRACT METHOD
     * ========================================================
     *
     * Functional interface must contain
     * only ONE abstract method.
     */

    void run();
}



/*
 * ============================================================
 * IMPLEMENTATION CLASS
 * ============================================================
 */

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        /*
         * ========================================================
         * LAMBDA EXPRESSION
         * ========================================================
         *
         * This line:
         */

        FuntionalInterface myFuntion =
                () -> System.out.println("Executing...");


        /*
         * is internally equivalent to:
         *
         * ----------------------------------------------------
         *
         * FuntionalInterface myFuntion =
         *      new FuntionalInterface() {
         *
         *          @Override
         *          public void run() {
         *
         *              System.out.println(
         *                      "Executing..."
         *              );
         *          }
         *      };
         *
         * ----------------------------------------------------
         *
         * Lambda reduces boilerplate code.
         */



        /*
         * ========================================================
         * METHOD CALL
         * ========================================================
         *
         * Calls:
         * run()
         */

        myFuntion.run();
    }
}