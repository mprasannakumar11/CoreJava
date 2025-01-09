package com.corejava.misc;

public class MainOverloadExample {
    // Standard main method
    public static void main(String[] args) {
        System.out.println("Standard main method");
        main(10); // Calling the overloaded main method
        main("Hello"); // Calling another overloaded main method
    }

    // Overloaded main method with an int parameter
    public static void main(int number) {
        System.out.println("Overloaded main method with int: " + number);
    }

    // Overloaded main method with a String parameter
    public static void main(String message) {
        System.out.println("Overloaded main method with String: " + message);
    }
}

