package com.corejava.collections;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*The Map interface represents a collection of key-value pairs.
Each key is associated with one value, and keys are unique. */

public class MapInterfaceExample {
    public static void main(String[] args) throws IOException {

        /*A hash table-based implementation of the Map interface.
        It does not maintain any order of elements.*/
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "AA");
        hashMap.put(2, "BB");
        hashMap.put(3, "CC");
        hashMap.put(4, "DD");
        //replaces the value in same key 2
        hashMap.put(2, "BB");
        //one null allowed
        hashMap.put(null, "EE");

        System.out.println("HashMap: " + hashMap);
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.containsKey(3));


        /*A hash table and linked list implementation of the Map interface.
        It maintains the insertion order of elements.*/
        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("1", "AA");
        linkedHashMap.put("2", "BB");
        linkedHashMap.put("3", "CC");
        linkedHashMap.put("4", "DD");
        //replaces the value in same key 2
        linkedHashMap.put("2", "BB");
        //one null allowed
        linkedHashMap.put(null, "EE");
        linkedHashMap.put("", "FF");

        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println(linkedHashMap.entrySet());
        System.out.println(linkedHashMap.containsKey("3"));


         /*A Red-Black tree-based implementation of the NavigableMap interface.
         It maintains elements in their natural order.*/
        Map<String, String> treeMap = new TreeMap<>();

        treeMap.put("1", "AA");
        treeMap.put("2", "BB");
        treeMap.put("3", "CC");
        treeMap.put("4", "DD");
        //replaces the value in same key 2
        treeMap.put("2", "BB");

        //NullPointerException
        //treeMap.put(null, "EE");
        treeMap.put("", "FF");

        System.out.println("TreeMap: " + treeMap);
        System.out.println(treeMap.entrySet());
        System.out.println(treeMap.containsKey("3"));

    }
}
