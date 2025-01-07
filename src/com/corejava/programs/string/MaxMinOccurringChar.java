package com.corejava.programs.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxMinOccurringChar {
    public static void main(String[] args) {

        String input = "prasannakumar";

        Map<Character, Long> charCountMap = input
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        char maxChar = charCountMap
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        char minChar = charCountMap
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Maximum occurring character: " + maxChar + " (occurs " + charCountMap.get(maxChar) + " times)");
        System.out.println("Minimum occurring character: " + minChar + " (occurs " + charCountMap.get(minChar) + " times)");
    }
}
