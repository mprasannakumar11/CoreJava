package com.corejava.misc.withoutmain;

public class StaticBlockExample {
    static {
        System.out.println("This code is executed without a main method.");
        System.exit(0); // Exits the program
    }
}

