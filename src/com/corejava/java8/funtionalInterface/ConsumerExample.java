package com.corejava.java8.funtionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumer = name -> System.out.println("Hello " + name);

        consumer.accept("Prasanna");


        List<String> names = Arrays.asList("John", "David", "Sam");

        Consumer<String> consumer1 = System.out::println;

        names.forEach(consumer1);

    }
}
