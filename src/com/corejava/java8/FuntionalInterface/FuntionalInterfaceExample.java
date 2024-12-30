package com.corejava.java8.FuntionalInterface;


public class FuntionalInterfaceExample {

    public static void main(String[] args) {
        FuntionalInterface myFuntion = () -> System.out.println("Executing...");
        myFuntion.run();
    }

}