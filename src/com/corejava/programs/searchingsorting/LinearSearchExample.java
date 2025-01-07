package com.corejava.programs.searchingsorting;

import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int key = scanner.nextInt();

        int index = linearSearch(array, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }

    //Linear Search
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

