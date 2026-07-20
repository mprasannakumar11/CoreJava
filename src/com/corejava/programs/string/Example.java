package com.corejava.programs.string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

         String input = "prasanna kumar m";


         Map<Character, Long> charCount = input
                 .chars()
                 .mapToObj(c -> (char) c)
                 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


         Character max = charCount
                 .entrySet()
                 .stream()
                 .max(Map.Entry.comparingByValue())
                 .get().getKey();

         Character min = charCount.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();


         System.out.println("max " + max + " min " +min);
    }


    private static void charCountUseStreams(String input) {

        input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((character, count) -> System.out.println(character + ": " + count));

    }

    private static Map<Character, Integer> charCount(String input) {

        Map<Character, Integer>  charCount = new HashMap<>();

        for(char c : input.toCharArray()) {

            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

        }

        return charCount;
    }
}
