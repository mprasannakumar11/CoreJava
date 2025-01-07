package com.corejava.programs.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedWord {

    public static void main(String[] args) {

        String paragraph = "Your paragraph goes here. This is where you can input the text you want to analyze.";
        String[] words = paragraph.toLowerCase().split("\\W+");

        Map<String, Long> wordCountMap = Arrays
                .stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        String mostRepeatedWord = wordCountMap
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Most repeated word: " + mostRepeatedWord + " (occurs " + wordCountMap.get(mostRepeatedWord) + " times)");

    }
}
