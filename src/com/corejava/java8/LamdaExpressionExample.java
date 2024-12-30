package com.corejava.java8;

import java.util.*;

public class LamdaExpressionExample {

    public static void main(String[] args) {

        // normal code
        List<String> names = Arrays.asList("prasanna", "kumar", "hari", "seena", "Zaheer");

        //using anonymous inner class
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        System.out.println("Sorted Names by length :" + names);

        // using lamda expression
        Collections.sort(names, (s1, s2) -> Integer.compare(s1.length(),s2.length()));

        System.out.println("Sorted Names by length using lamda :" + names);

        // using lamda expression
        names.sort(Comparator.comparingInt(String::length));

        System.out.println("Sorted Names by length using comparingInt :" + names);


    }
}
