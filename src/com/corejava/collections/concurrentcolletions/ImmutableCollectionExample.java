package com.corejava.collections.concurrentcolletions;

import java.util.*;

public class ImmutableCollectionExample {

    /*Immutable List: Use Collections.unmodifiableList or List.of (Java 9+).
      Immutable Set: Use Collections.unmodifiableSet or Set.of (Java 9+).
      Immutable Map: Use Collections.unmodifiableMap or Map.of (Java 9+). */
    public static void main(String[] args) {

        List<String> immutableList = List.of("apple", "banana", "cherry");
        System.out.println("Immutable List: " + immutableList);
        // Attempting to modify the immutable list will throw UnsupportedOperationException
        // immutableList.add("date");

        Set<String> immutableSet = Set.of("apple", "banana", "cherry");
        System.out.println("Immutable Set: " + immutableSet);

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        Set<String> immutableSet1 = Collections.unmodifiableSet(set);
        System.out.println("Immutable Set: " + immutableSet1);
        // Attempting to modify the immutable set will throw UnsupportedOperationException
        // immutableSet1.add("date");

        Map<String, Integer> immutableMap = Map.of("apple", 1, "banana", 2, "cherry", 3);
        System.out.println("Immutable Map: " + immutableMap);

        // Attempting to modify the immutable map will throw UnsupportedOperationException
        // immutableMap.put("date", 4);

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        Map<String, Integer> immutableMap1 = Collections.unmodifiableMap(map);
        System.out.println("Immutable Map: " + immutableMap1);
        // Attempting to modify the immutable map will throw UnsupportedOperationException
        // immutableMap1.put("date", 4);
    }
}
