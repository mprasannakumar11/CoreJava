package com.corejava.java8.FuntionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> isLengthGreatedThan5 = str -> str.length() > 5;

        System.out.println(isLengthGreatedThan5.test("HelloPrasanna"));
        System.out.println(isLengthGreatedThan5.test("Hi.."));

    }
}
