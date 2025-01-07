package com.corejava.programs.string;

public class ReverseStringExample {
    public static void main(String[] args) {


        String originalString = "Hello, World!";
        String reversedString = reverseUsingLoop(originalString);
        //String reversedString = reverseUsingStringBuilder(originalString);
        //String reversedString = reverseUsingRecursion(originalString);

        System.out.println("Reversed String using StringBuilder: " + reversedString);
    }

    public static String reverseUsingLoop(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseUsingRecursion(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }

}

