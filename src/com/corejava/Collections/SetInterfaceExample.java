package com.corejava.Collections;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceExample {

    /*The Set interface represents a collection that does not allow duplicate elements.
    Sets do not maintain the order of elements.*/

    public static void main(String[] args) throws IOException {

       /* A hash table-based implementation of the Set interface.
       It does not maintain any order of elements.
        */

        Set<String> hashSet = new HashSet<>();
        hashSet.add("DD");
        hashSet.add("AA");
        hashSet.add("BB");
        hashSet.add("BB");
        hashSet.add("CC");
        hashSet.add(null);
        hashSet.add("");

        System.out.println("HashSet: " + hashSet);
        System.out.println(hashSet.isEmpty());

        System.out.println(hashSet.remove("DD"));
        System.out.println(hashSet);

    /*A hash table and linked list implementation of the Set interface.
    It maintains the insertion order of elements. */
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("DD");
        linkedHashSet.add("AA");
        linkedHashSet.add("BB");
        linkedHashSet.add("BB");
        linkedHashSet.add("CC");
        linkedHashSet.add(null);
        linkedHashSet.add("");

        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println(linkedHashSet.isEmpty());

        System.out.println(linkedHashSet.remove("DD"));
        System.out.println(linkedHashSet);


    /*A NavigableSet implementation based on a red-black tree.
    It maintains elements in their natural order. */
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("DD");
        treeSet.add("AA");
        treeSet.add("BB");
        treeSet.add("BB");
        treeSet.add("CC");
        // NullPointerException
        //treeSet.add(null);
        treeSet.add("");

        System.out.println("TreeSet: " + treeSet);
        System.out.println(treeSet.isEmpty());

        System.out.println(treeSet.remove("DD"));
        System.out.println(treeSet);

    }

}
