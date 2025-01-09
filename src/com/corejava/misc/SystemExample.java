package com.corejava.misc;

import java.util.Scanner;

public class SystemExample {

    public static void main(String[] args) {
        // Use of System.out
        System.out.println("Println");

        // Scanner class with System.in
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Printing the output
        System.out.printf("Addition: %d", x + y);

        // Printing error
        System.err.println(
                "This is how we throw error with System.err");
    }
}
