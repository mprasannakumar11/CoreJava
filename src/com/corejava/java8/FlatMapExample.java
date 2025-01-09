package com.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Lhe flatMap method in Java's Stream API is used to flatten a stream of streams into a single stream.
It maps each element of the stream to a new stream and then flattens the resulting streams into a single stream.
This is particularly useful when you have a list of lists or a collection of collections and you want to process all the elements in a single pipeline.*/

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        // Flatten the list of lists into a single list
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened List: " + flattenedList);
    }
}

