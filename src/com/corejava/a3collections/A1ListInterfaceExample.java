package com.corejava.a3collections;

import java.io.IOException;
import java.util.*;

public class A1ListInterfaceExample {

    /*
     * LIST INTERFACE
     * =====================================================
     *
     * The List interface is part of Java Collection Framework.
     *
     * Features of List:
     * 1. Maintains insertion order.
     * 2. Allows duplicate elements.
     * 3. Allows null values.
     * 4. Elements can be accessed using index.
     *
     * Example:
     * Index -> 0   1   2   3
     * Value -> AA  BB  CC  DD
     */

    public static void main(String[] args) throws IOException {

        /*
         * =====================================================
         * ARRAYLIST
         * =====================================================
         *
         * ArrayList is a resizable array implementation.
         *
         * Internally uses:
         * -> Dynamic Array
         *
         * Features:
         * 1. Fast random access using index.
         * 2. Allows duplicates.
         * 3. Maintains insertion order.
         * 4. Allows multiple null values.
         *
         * Performance:
         * Access using get(index)      -> O(1)
         * Insert/Delete in middle      -> O(n)
         *
         * Best when:
         * -> More read operations
         * -> Less insertion/deletion
         */

        List<String> listNames = new ArrayList<>();

        /*
         * add()
         * Adds element to the end of list.
         */

        listNames.add("AA");
        listNames.add("BB");

        /*
         * Duplicate values are allowed in List.
         */
        listNames.add("BB");

        listNames.add("CC");
        listNames.add("DD");

        /*
         * List allows null values.
         */
        listNames.add(null);

        /*
         * Empty string is also valid.
         */
        listNames.add("");

        /*
         * Output maintains insertion order.
         */
        System.out.println("ArrayList: " + listNames);

        /*
         * size()
         * Returns total number of elements.
         */
        System.out.println("Size: " + listNames.size());

        /*
         * get(index)
         * Retrieves element from specific index.
         *
         * Index starts from 0.
         */
        System.out.println("Element at index 1: " + listNames.get(1));

        /*
         * remove(index)
         * Removes element from specified index.
         *
         * Returns removed element.
         */
        System.out.println("Removed Element: " + listNames.remove(2));

        /*
         * List after removal.
         */
        System.out.println("After Removal: " + listNames);



        /*
         * =====================================================
         * LINKEDLIST
         * =====================================================
         *
         * LinkedList is a doubly-linked list implementation.
         *
         * Internally uses:
         * -> Doubly Linked List
         *
         * Features:
         * 1. Better insertion/deletion performance.
         * 2. Maintains insertion order.
         * 3. Allows duplicates.
         * 4. Allows null values.
         *
         * Performance:
         * Access using get(index)      -> O(n)
         * Insert/Delete                -> O(1)
         *
         * Best when:
         * -> Frequent insertion/deletion
         * -> Less random access
         */

        List<String> linkedListNames = new LinkedList<>();

        linkedListNames.add("AA");
        linkedListNames.add("BB");

        // Duplicate allowed
        linkedListNames.add("BB");

        linkedListNames.add("CC");
        linkedListNames.add("DD");

        // Null allowed
        linkedListNames.add(null);

        linkedListNames.add("");

        /*
         * Maintains insertion order.
         */
        System.out.println("LinkedList: " + linkedListNames);

        /*
         * Accessing element using index.
         *
         * Slower compared to ArrayList
         * because LinkedList traverses nodes.
         */
        System.out.println("Element at index 1: " + linkedListNames.get(1));

        /*
         * Removes element at index 2.
         */
        System.out.println("Removed Element: " + linkedListNames.remove(2));

        /*
         * List after removal.
         */
        System.out.println("After Removal: " + linkedListNames);
    }
}