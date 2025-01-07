package com.corejava.programs.string;

public class SwapStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping: str1 = " + str1 + ", str2 = " + str2);

        str1 = str1 + str2;         // Concatenate str1 and str2
        str2 = str1.substring(0, str1.length() - str2.length());  // Extract original str1 from the new str1
        str1 = str1.substring(str2.length());  // Extract original str2 from the new str1

        System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);
    }
}
