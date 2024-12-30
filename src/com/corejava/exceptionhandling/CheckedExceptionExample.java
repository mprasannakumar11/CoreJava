package com.corejava.exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionExample {

    /* Checked exceptions are exceptions that are checked at compile-time.
    They must handle either try-catch block or declared in the method signature */

    /* Checked exceptions
    IOException: I/O operation failures.
    FileNotFoundException: File not found.
    ClassNotFoundException: Class loading failures.
    SQLException: Database access errors.
    InterruptedException: Thread interruption.
    NoSuchMethodException: Method not found.
    InvocationTargetException: Exception during method invocation.
    InstantiationException: Instantiation failures.
    IllegalAccessException: Illegal access during reflection.
    MalformedURLException: Malformed URL.
    CloneNotSupportedException: Clone method errors.
    GeneralSecurityException: Security-related exceptions. */


    public static void readFile() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("file.txt");
        int data;
        while ((data = fileInputStream.read()) != -1) {
            System.out.print((char) data);
        }

    }

    public static void main(String[] args) throws IOException {

        readFile();
    }
}