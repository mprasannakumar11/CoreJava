package com.corejava.collections;

import java.io.IOException;
import java.util.*;

public class ListInterfaceExample {

    public static void main(String[] args) throws IOException {

        // A resizable array implementation of the List interface. It provides fast random access to elements.
        // Data Structure: Dynamic Array
        // Access time: O(1)
        // Insertion/Deletion: O(n)
        // Memory Usage: Less memory overhead

        List<String> listNames = new ArrayList<>();

        listNames.add("AA");
        listNames.add("BB");
        listNames.add("BB");
        listNames.add("CC");
        listNames.add("DD");
        listNames.add(null);
        listNames.add("");

        System.out.println("ArrayList " +listNames);
        System.out.println(listNames.size());
        System.out.println(listNames.get(1));
        System.out.println(listNames.remove(2));

        /* A doubly-linked list implementation of the List interface.
           It provides better performance for add and remove operations compared to ArrayList*/

        // Data Structure: doubly-linked list
        // Access time: O(n)
        // Insertion/Deletion: O(1)
        // Memory Usage: More memory overhead

        List<String> linkeListNames = new LinkedList<>();

        linkeListNames.add("AA");
        linkeListNames.add("BB");
        linkeListNames.add("BB");
        linkeListNames.add("CC");
        linkeListNames.add("DD");
        linkeListNames.add(null);
        listNames.add("");

        System.out.println("LinkedList" +linkeListNames);
        System.out.println(linkeListNames.get(1));
        System.out.println(linkeListNames.remove(2));

    }
}
