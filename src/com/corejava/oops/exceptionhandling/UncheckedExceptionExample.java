package com.corejava.oops.exceptionhandling;

public class UncheckedExceptionExample {

    /* Unchecked exceptions in Java are exceptions that are not checked at compile-time.
    They are also known as runtime exceptions and extend the RuntimeException class. */

    /*  ArithmeticException: Exceptional arithmetic conditions (e.g., division by zero).
        ArrayIndexOutOfBoundsException: Illegal array index access.
        NullPointerException: Using null where an object is required.
        ClassCastException: Invalid type casting.
        IllegalArgumentException: Illegal or inappropriate method arguments.
        IllegalStateException: Illegal method invocation timing.
        NumberFormatException: Invalid string-to-number conversion.
        IndexOutOfBoundsException: Index out of range.
        UnsupportedOperationException: Unsupported operation requests.
        ConcurrentModificationException: Concurrent modification detection.
        StringIndexOutOfBoundsException: String index out of range.
        NegativeArraySizeException: Negative array size.
        ArrayStoreException: Invalid object type in array storage.
        SecurityException: Security violations. */

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
