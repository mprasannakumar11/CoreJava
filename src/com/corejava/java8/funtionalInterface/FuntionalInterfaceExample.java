package com.corejava.java8.funtionalInterface;


public class FuntionalInterfaceExample {

    public static void main(String[] args) {
        FuntionalInterface myFuntion = () -> System.out.println("Executing...");
        myFuntion.run();
    }

}