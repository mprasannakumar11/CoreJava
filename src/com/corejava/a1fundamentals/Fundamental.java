package com.corejava.a1fundamentals;

public class Fundamental {

    public static void main(String[] args) {

        /*int range:
        Min: -2147483648
        Max: 2147483647*/
        int value = 1;

        var variable = "variable";

       /* float uses 4 bytes (32 bits) memory
        Supports decimal values
        Suffix f or F is mandatory because decimal literals are treated as double by default
        Approximate precision: about 6–7 decimal digits*/
        float floatValue = 1.538f;

        /*Uses 8 bytes (64 bits) memory
        Default type for decimal values in Java
        Precision is about 15–16 decimal digits
        More accurate than float

        Range:
        Minimum positive value: 4.9E-324
        Maximum value: 1.7976931348623157E308*/
        double primitiveDoubleValue = 123.56;

        /*Uses 2 bytes (16 bits) memory
        Stores Unicode characters
        Value must be inside single quotes ' '
        Can store letters, numbers, symbols, and Unicode characters*/
        char primitiveCharacter = 'D';

        /*Can store only two values: true or false
        Mainly used in conditions, decision-making, and loops
        Size is JVM dependent (typically 1 bit logically)*/
        boolean toggle = true;

        /*String is not a primitive data type
        Strings are immutable (cannot be changed after creation)
        Stored inside double quotes " "
        Commonly used for names, messages, JSON, API data, etc.*/
        String name = "name";

       /* Part of java.lang package
        Can store null unlike primitive int
        Useful in Collections like List<Integer>
        Supports utility methods like parsing and conversions
        Java automatically converts between int and Integer using autoboxing/unboxing*/
        Integer integerVal = 1;

        /*Part of java.lang package
        Can store null
        Used in Collections like List<Float>
        Supports utility methods and conversions
        Requires f suffix for float literals*/
        Float floatValue1 = 12.56f;
        Double doubleValue = 12.35;
        Character character = 'C';
        Boolean toggleValue = true;

        /*StringBuffer is a mutable class in Java used to modify strings
        without creating new objects repeatedly.

        Mutable (content can be changed)
        Thread-safe (methods are synchronized)
        Slower than StringBuilder because of synchronization
        Used when multiple threads modify the same string*/
        StringBuffer stringBuffer = new StringBuffer("name");

       /* StringBuilder is a mutable class in Java used for
       efficient string manipulation.

        Mutable (can modify existing string)
        Faster than StringBuffer
        Not thread-safe (not synchronized)
        Preferred in single-threaded applications*/
        StringBuilder stringBuilder = new StringBuilder("name");

        int[] array = new int[2];
        int[][] doubleArray = new int[2][2];

        // Using all variables

        System.out.println("int value: " + value);
        System.out.println("var variable: " + variable);

        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + primitiveDoubleValue);

        System.out.println("char value: " + primitiveCharacter);
        System.out.println("boolean value: " + toggle);

        System.out.println("String value: " + name);

        System.out.println("Integer value: " + integerVal);
        System.out.println("Float value: " + floatValue1);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Character value: " + character);
        System.out.println("Boolean value: " + toggleValue);

        stringBuffer.append(" Kumar");
        System.out.println("StringBuffer value: " + stringBuffer);

        stringBuilder.append(" Kumar");
        System.out.println("StringBuilder value: " + stringBuilder);

        array[0] = 10;
        array[1] = 20;

        System.out.println("Array values:");
        for (int num : array) {
            System.out.println(num);
        }

        doubleArray[0][0] = 1;
        doubleArray[0][1] = 2;
        doubleArray[1][0] = 3;
        doubleArray[1][1] = 4;

        System.out.println("2D Array values:");
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
