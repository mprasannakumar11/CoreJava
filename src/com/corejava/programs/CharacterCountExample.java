package com.corejava.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountExample {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Map<Character, Integer> charCountMap = countCharacters(input);

        System.out.println("Character Count:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using Streams
        Map<Character, Long> charCountMap1 = countCharactersUsingStreams(input);

        System.out.println("Character Count:");
        charCountMap1.forEach((character, count) -> System.out.println(character + ": " + count));

    }

    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }


    public static Map<Character, Long> countCharactersUsingStreams(String str) {
        return str.chars() // Convert the string to an IntStream of character codes
                .mapToObj(c -> (char) c) // Convert the IntStream to a Stream<Character>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Count the occurrences of each character
    }
}

