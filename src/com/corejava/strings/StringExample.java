package com.corejava.strings;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringExample {
    public static void main(String[] args) {
        // Using String class
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = "Hello";

        // String concatenation
        String str4 = str1 + " " + str2 + "!";
        System.out.println("Concatenated String: " + str4);

        // String comparison
        boolean isEqual = str1.equals(str3);
        System.out.println("str1 equals str3: " + isEqual);

        // String length
        int length = str4.length();
        System.out.println("Length of str4: " + length);

        // Character extraction
        char ch = str1.charAt(1);
        System.out.println("Character at index 1 in str1: " + ch);

        // Substring
        String subStr = str4.substring(6, 11);
        System.out.println("Substring of str4: " + subStr);

        // String toUpperCase and toLowerCase
        String upperCaseStr = str4.toUpperCase();
        String lowerCaseStr = str4.toLowerCase();
        System.out.println("Uppercase: " + upperCaseStr);
        System.out.println("Lowercase: " + lowerCaseStr);

        // Using StringBuilder class
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        stringBuilder.append("!");
        System.out.println("StringBuilder result: " + stringBuilder.toString());

        // Using StringBuffer class
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        stringBuffer.append("!");
        System.out.println("StringBuffer result: " + stringBuffer.toString());

        // Reversing a string using StringBuilder
        StringBuilder reverseStr = new StringBuilder("ABCDE");
        reverseStr.reverse();
        System.out.println("Reversed string: " + reverseStr.toString());

        //String text blocks were introduced in Java 15 as a standard feature

        String textBlock = """
                This is a text block
                with multiple lines.
                """;

        // Strip indentation
        String stripped = textBlock.stripIndent();
        System.out.println("Stripped:\n" + stripped);

        // Translate escape sequences
        String escaped = "Hello\\nWorld";
        String translated = escaped.translateEscapes();
        System.out.println("Translated:\n" + translated);

        // Using formatted
        String template = "Hello, %s!";
        String formatted = template.formatted("Alice");
        System.out.println("Formatted:\n" + formatted); //--------------------End

        /*The StringTokenizer class in Java is a legacy class that was introduced in Java 1.0.*/

        String str = "Java is fun";
        StringTokenizer tokenizer = new StringTokenizer(str);
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        } //---------------------------End

        /* StringJoiner is a utility class introduced in Java 8 */

        String[] items = {"apple", "banana", "cherry"};
        // Creating a StringJoiner with a delimiter, prefix, and suffix
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        for (String item : items) {
            stringJoiner.add(item);
        }
        // Printing the result
        System.out.println("Joined String: " + stringJoiner.toString());
    } //--------------------------------------End
}
