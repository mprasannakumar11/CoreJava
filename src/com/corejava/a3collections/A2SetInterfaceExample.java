package com.corejava.a3collections;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class A2SetInterfaceExample {

    /*
     * SET INTERFACE
     * =========================
     *
     * The Set interface is part of Java Collection Framework.
     *
     * Main Features:
     * 1. Does NOT allow duplicate elements.
     * 2. Stores only unique values.
     * 3. Different implementations maintain data differently.
     *
     * Example:
     * If "BB" is added two times,
     * only one "BB" will be stored.
     */

    public static void main(String[] args) throws IOException {

        /*
         * =========================================================
         * HASHSET
         * =========================================================
         *
         * HashSet internally uses Hash Table.
         *
         * Features:
         * 1. Does NOT maintain insertion order.
         * 2. Allows one null value.
         * 3. Fast for insert, delete, search operations.
         * 4. Duplicate values are ignored.
         *
         * Best when order is not important.
         */

        Set<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("DD");
        hashSet.add("AA");
        hashSet.add("BB");

        /*
         * Duplicate element
         * HashSet will ignore this value
         * because Set stores only unique values.
         */
        hashSet.add("BB");

        hashSet.add("CC");

        /*
         * HashSet allows one null value
         */
        hashSet.add(null);

        /*
         * Empty string is also valid
         */
        hashSet.add("");

        /*
         * Output order may change every time
         * because HashSet does not maintain order.
         */
        System.out.println("HashSet: " + hashSet);

        /*
         * isEmpty()
         * Returns true if set has no elements.
         */
        System.out.println(hashSet.isEmpty());

        /*
         * remove()
         * Removes specified element.
         *
         * Returns:
         * true  -> if element exists and removed
         * false -> if element not found
         */
        System.out.println(hashSet.remove("DD"));

        // After removing "DD"
        System.out.println(hashSet);



        /*
         * =========================================================
         * LINKEDHASHSET
         * =========================================================
         *
         * LinkedHashSet uses:
         * 1. Hash Table
         * 2. Linked List
         *
         * Features:
         * 1. Maintains insertion order.
         * 2. No duplicate values.
         * 3. Allows one null value.
         * 4. Slightly slower than HashSet.
         *
         * Best when insertion order is important.
         */

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("DD");
        linkedHashSet.add("AA");
        linkedHashSet.add("BB");

        // Duplicate ignored
        linkedHashSet.add("BB");

        linkedHashSet.add("CC");

        // Allowed
        linkedHashSet.add(null);

        linkedHashSet.add("");

        /*
         * Output order will be same as insertion order.
         *
         * Example:
         * [DD, AA, BB, CC, null, ]
         */
        System.out.println("LinkedHashSet: " + linkedHashSet);

        System.out.println(linkedHashSet.isEmpty());

        System.out.println(linkedHashSet.remove("DD"));

        System.out.println(linkedHashSet);



        /*
         * =========================================================
         * TREESET
         * =========================================================
         *
         * TreeSet internally uses Red-Black Tree.
         *
         * Features:
         * 1. Stores elements in sorted order.
         * 2. Does NOT allow duplicates.
         * 3. Does NOT allow null values.
         * 4. Slower than HashSet for insertion/search.
         *
         * Best when sorted data is needed.
         */

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("DD");
        treeSet.add("AA");
        treeSet.add("BB");

        // Duplicate ignored
        treeSet.add("BB");

        treeSet.add("CC");

        /*
         * TreeSet does NOT allow null.
         *
         * Reason:
         * TreeSet sorts elements.
         * null cannot be compared with String values.
         *
         * So it throws:
         * NullPointerException
         */
        // treeSet.add(null);

        treeSet.add("");

        /*
         * Output will be sorted automatically.
         *
         * Example:
         * [, AA, BB, CC, DD]
         */
        System.out.println("TreeSet: " + treeSet);

        System.out.println(treeSet.isEmpty());

        System.out.println(treeSet.remove("DD"));

        System.out.println(treeSet);
    }
}
