package com.corejava.misc;

public class FinallyBlockMayNotExecute {


    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            System.exit(0);
        } finally {
            System.out.println("This will not be executed");
        }
    }

    // Infinite loop

    /*try

    {
        while (true) {
            System.out.println("Inside infinite loop");
        }
    } finally

    {
        System.out.println("This will not be executed");
    }*/

}
