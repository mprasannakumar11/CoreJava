package com.corejava.strings;

/* The intern() method returns a canonical representation of the string object.
When the intern() method is invoked on a String object,
it checks the string pool to see if an identical string already exists.
If the string pool contains a string equal to the current string, the method returns the reference to that string.
If not, it adds the string to the pool and returns its reference.

String Pool
The string pool (or interned string pool) is a special area of memory in the
Java heap where Java stores literal string values and interned strings.
This pool helps in saving memory by avoiding the creation of multiple instances of the same string.
*/

public class InternMethodExample {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        // Before interning
        System.out.println(s1 == s2); // Outputs: false

        // Interning strings
        s1 = s1.intern();
        s2 = s2.intern();

        // After interning
        System.out.println(s1 == s2); // Outputs: true
    }
}

