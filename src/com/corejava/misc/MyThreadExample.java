package com.corejava.misc;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyThreadExample {

    public static void main(String [] args) {

       List<String> words = Arrays.asList("apple", "banana", "cherry", "mango", "grapefruit","pineapplefruit");



        Map<String, Long> SortedWords = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String value = SortedWords.
                entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .skip(1)
                .findFirst()
                .get()
                .getKey();

        System.out.println("Second Highest value  " +  value);



    }
}
