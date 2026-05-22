package com.corejava.java8.defaultmethods;

// Interface with default method
/*
 * ============================================================
 * DEFAULT METHOD IN INTERFACE
 * ============================================================
 *
 * Before Java 8:
 * ------------------------------------------------
 * Interfaces could contain ONLY:
 * -> abstract methods
 *
 * Example:
 *
 * interface Test {
 *     void show();
 * }
 *
 * Every implementing class MUST implement
 * all interface methods.
 *
 * ============================================================
 * PROBLEM BEFORE JAVA 8
 * ============================================================
 *
 * Suppose:
 * Millions of classes implement an interface.
 *
 * If new method added to interface:
 *
 * interface Test {
 *     void show();
 *     void print();
 * }
 *
 * Then ALL existing implementation classes
 * break with compilation errors.
 *
 * Because:
 * print() must be implemented everywhere.
 *
 * ============================================================
 * SOLUTION: DEFAULT METHODS
 * ============================================================
 *
 * Java 8 introduced:
 * -> default methods
 *
 * Default methods contain implementation
 * directly inside interface.
 *
 * So implementing classes:
 * -> May use default implementation
 * OR
 * -> Override it.
 *
 * ============================================================
 * YOUR EXAMPLE
 * ============================================================
 */


/*
 * ============================================================
 * INTERFACE
 * ============================================================
 */

interface DefaultInterface {

    /*
     * ========================================================
     * DEFAULT METHOD
     * ========================================================
     *
     * default keyword allows:
     * -> Method body inside interface.
     *
     * This method is NOT mandatory
     * for implementing classes.
     */

    default void run() {

        System.out.println(
                "this is the default method in interface"
        );
    }



    /*
     * ========================================================
     * ABSTRACT METHOD
     * ========================================================
     *
     * No method body.
     *
     * Mandatory for implementation class.
     */

    void rerun();
}



/*
 * ============================================================
 * IMPLEMENTATION CLASS
 * ============================================================
 *
 * implements keyword:
 * -------------------------
 * Used to implement interface.
 */

public class DefaultInterfaceExample
        implements DefaultInterface {

    /*
     * ========================================================
     * IMPLEMENTING ABSTRACT METHOD
     * ========================================================
     *
     * rerun() is mandatory because:
     * -> It is abstract method.
     */

    @Override
    public void rerun() {

        System.out.println(
                "this is the rerun method in implementation class"
        );
    }



    /*
     * ========================================================
     * NOTICE:
     * ========================================================
     *
     * run() method NOT implemented here.
     *
     * Why?
     * ------------------------------------------------
     * Because interface already provides
     * default implementation.
     *
     * So class automatically inherits it.
     */
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
         * OBJECT CREATION
         * ====================================================
         */

        DefaultInterfaceExample defaultInterfaceExample =
                new DefaultInterfaceExample();



        /*
         * ====================================================
         * CALLING DEFAULT METHOD
         * ====================================================
         *
         * Since class did not override run(),
         * interface default implementation executes.
         */

        defaultInterfaceExample.run();



        /*
         * ====================================================
         * CALLING IMPLEMENTED METHOD
         * ====================================================
         */

        defaultInterfaceExample.rerun();
    }
}
