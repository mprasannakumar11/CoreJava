package com.corejava.a3collections;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * MAP INTERFACE
 * ==========================================================
 *
 * The Map interface is part of Java Collection Framework.
 *
 * Map stores data in:
 * -> Key and Value pairs
 *
 * Example:
 * Key   Value
 * ----------------
 * 1     AA
 * 2     BB
 * 3     CC
 *
 * Important Points:
 * 1. Keys must be unique.
 * 2. Values can be duplicate.
 * 3. Each key maps to exactly one value.
 * 4. Map is NOT part of Collection interface.
 *
 * Syntax:
 * Map<KeyDatatype, ValueDatatype>
 */

public class A3MapInterfaceExample {

    public static void main(String[] args) throws IOException {

        /*
         * ==========================================================
         * HASHMAP
         * ==========================================================
         *
         * HashMap internally uses:
         * -> Hash Table
         *
         * Features:
         * 1. Does NOT maintain insertion order.
         * 2. Stores elements randomly.
         * 3. Allows one null key.
         * 4. Allows multiple null values.
         * 5. Fastest among map implementations.
         *
         * Performance:
         * put()       -> O(1)
         * get()       -> O(1)
         * remove()    -> O(1)
         *
         * Best when:
         * -> Order is not important
         * -> Fast performance needed
         */

        Map<Integer, String> hashMap = new HashMap<>();

        /*
         * put(key, value)
         * -----------------------
         * Adds key-value pair into map.
         */

        hashMap.put(1, "AA");
        hashMap.put(2, "BB");
        hashMap.put(3, "CC");
        hashMap.put(4, "DD");

        /*
         * Duplicate Keys NOT Allowed
         * ----------------------------
         *
         * If same key already exists,
         * old value gets replaced.
         *
         * Here:
         * Key = 2 already exists.
         *
         * Old Value -> BB
         * New Value -> BB
         *
         * If value was different,
         * old value would be replaced.
         */

        hashMap.put(2, "BB");

        /*
         * HashMap allows one null key.
         */

        hashMap.put(null, "EE");

        /*
         * Output order is NOT guaranteed.
         * May vary every execution.
         */

        System.out.println("HashMap: " + hashMap);

        /*
         * entrySet()
         * --------------------
         * Returns all key-value pairs.
         */

        System.out.println(hashMap.entrySet());

        /*
         * containsKey(key)
         * --------------------
         * Checks whether key exists.
         *
         * Returns:
         * true  -> key exists
         * false -> key not exists
         */

        System.out.println(hashMap.containsKey(3));



        /*
         * ==========================================================
         * LINKEDHASHMAP
         * ==========================================================
         *
         * LinkedHashMap internally uses:
         * 1. Hash Table
         * 2. Linked List
         *
         * Features:
         * 1. Maintains insertion order.
         * 2. Allows one null key.
         * 3. Allows multiple null values.
         * 4. Slightly slower than HashMap.
         *
         * Best when:
         * -> Insertion order is important
         */

        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("1", "AA");
        linkedHashMap.put("2", "BB");
        linkedHashMap.put("3", "CC");
        linkedHashMap.put("4", "DD");

        /*
         * Same key replaces old value.
         */

        linkedHashMap.put("2", "BB");

        /*
         * One null key allowed.
         */

        linkedHashMap.put(null, "EE");

        /*
         * Empty string key is valid.
         */

        linkedHashMap.put("", "FF");

        /*
         * Output will maintain insertion order.
         */

        System.out.println("LinkedHashMap: " + linkedHashMap);

        System.out.println(linkedHashMap.entrySet());

        System.out.println(linkedHashMap.containsKey("3"));



        /*
         * ==========================================================
         * TREEMAP
         * ==========================================================
         *
         * TreeMap internally uses:
         * -> Red-Black Tree
         *
         * Features:
         * 1. Stores keys in sorted order.
         * 2. Does NOT allow null keys.
         * 3. Slower compared to HashMap.
         * 4. Useful for sorted data.
         *
         * Performance:
         * put()       -> O(log n)
         * get()       -> O(log n)
         * remove()    -> O(log n)
         *
         * Best when:
         * -> Sorted keys are needed
         */

        Map<String, String> treeMap = new TreeMap<>();

        treeMap.put("1", "AA");
        treeMap.put("2", "BB");
        treeMap.put("3", "CC");
        treeMap.put("4", "DD");

        /*
         * Same key replaces old value.
         */

        treeMap.put("2", "BB");

        /*
         * TreeMap does NOT allow null key.
         *
         * Reason:
         * TreeMap sorts keys internally.
         *
         * null cannot be compared with
         * other String keys.
         *
         * So it throws:
         * NullPointerException
         */

        // treeMap.put(null, "EE");

        /*
         * Empty string is allowed.
         */

        treeMap.put("", "FF");

        /*
         * Output automatically sorted by keys.
         */

        System.out.println("TreeMap: " + treeMap);

        System.out.println(treeMap.entrySet());

        System.out.println(treeMap.containsKey("3"));
    }
}