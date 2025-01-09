package com.corejava.misc.shadowing;

/* Key Points:
Scope Matters: The scope of a variable determines where it can be accessed.
Inner scopes can shadow variables from outer scopes with the same name.

Readability: While variable shadowing is allowed, it can make the code harder to read and understand.
It’s often better to use different names for variables in different scopes to avoid confusion. */


public class Shadow {
    // Class-level variable
    static int x = 10;

    public static void main(String[] args) {
        // Method-level variable shadows class-level variable
        int x = 20;
        System.out.println("Method-level variable x: " + x); // Outputs 20

        // Using 'this' keyword to refer to class-level variable
        System.out.println("Class-level variable x: " + Shadow.x); // Outputs 10

        // Block-level variable shadows method-level variable
        // latest java not allowing i guess
        {
            //int x = 30;
            System.out.println("Block-level variable x: " + x); // Outputs 30
        }

        // Method-level variable x is still accessible here
        System.out.println("Method-level variable x after block: " + x); // Outputs 20
    }
}
