package com.corejava.programs;

public class FactorialExample {
    public static void main(String[] args) {
        int number = 5; // You can change this value to calculate the factorial of a different number
        long factorial = factorialUsingIteration(number);
        //long factorial = factorialUsingRecursion(number);
        System.out.println("Factorial of " + number + " using iteration is: " + factorial);
    }

    public static long factorialUsingIteration(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialUsingRecursion(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialUsingRecursion(n - 1);
        }
    }
}

