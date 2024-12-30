package com.corejava.programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciIterative {
    public static void main(String[] args) {
        int count = 10; // Number of terms in the Fibonacci series
        fibonacciIterative(count);
    }

    public static void fibonacciIterative(int count) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2); // Printing the first two terms

        for (int i = 2; i < count; ++i) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static List<Integer> generateFibonacci(int count) {
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(count)
                .map(n -> n[0])
                .collect(Collectors.toList());
    }
}

