package com.corejava.exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesExample {

    /* Checked exceptions are exceptions that are checked at compile-time.
    They must handle either try-catch block or declared in the method signature */


    public static void readFile() {

        try (FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        readFile();
    }
}