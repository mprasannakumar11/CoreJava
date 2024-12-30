package com.corejava.java8.funtionalInterface;

import java.util.function.Function;

public class FuntionExample {
    public static void main(String[] args) {
        Function<String, String> isLengthGreatedThan5 = str -> str.toUpperCase();

        System.out.println(isLengthGreatedThan5.apply("Hello Prasanna"));
        System.out.println(isLengthGreatedThan5.apply("hi.."));

    }
}
