package com.corejava.oops.polymorphism;

// Also known as method overloading and Static Binding(Early Binding)
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling the method to add two integers
        int sum1 = calculator.add(10, 20);
        System.out.println("Sum of two integers: " + sum1); // Outputs: 30

        // Calling the method to add three integers
        int sum2 = calculator.add(10, 20, 30);
        System.out.println("Sum of three integers: " + sum2); // Outputs: 60

        // Calling the method to add two double values
        double sum3 = calculator.add(10.5, 20.5);
        System.out.println("Sum of two doubles: " + sum3); // Outputs: 31.0
    }
}
