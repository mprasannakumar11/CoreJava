package com.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIExample {

    public static void main(String[] args) {

        // using streams with filter and map and collect
        List<String> names = Arrays.asList("prasanna", "hari", "akhil", "seena", "zuber");
        List<String> sortedNames = names.stream()
                .filter(name -> name.startsWith("p"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(sortedNames);


        //using length method and sorted using set
        Set<Integer> sortednameslength = names.stream()
                .filter(name -> name.length()>2)
                .map(String::length)
                .collect(Collectors.toList())
                .stream()
                .sorted()
                .collect(Collectors.toSet());

        System.out.println(sortednameslength);



    }
}
