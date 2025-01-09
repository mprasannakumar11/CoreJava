package com.corejava.misc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//finalize already deprecated and using finally block now
public class MethodfinalizeExample {
    FileInputStream fis = null;

    public MethodfinalizeExample(String filePath) throws FileNotFoundException {
        try {
            fis = new FileInputStream(filePath);
            System.out.println("Resource acquired: " + filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally { // This block will always execute
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("FileInputStream closed");
                } catch (IOException e) {
                    System.err.println("Failed to close FileInputStream: " + e.getMessage());
                }
            }
        }
    }

    // Its deprecated in java 9 now using final block or try with resources

    //@Override
    /*protected void finalize() throws Throwable {
        try {
            if (fis != null) {
                fis.close();
                System.out.println("Resource released in finalize()");
            }
        } finally {
            super.finalize();
        }
    }*/

    public static void main(String[] args) throws FileNotFoundException {

        MethodfinalizeExample holder = new MethodfinalizeExample("example.txt");
        // Do something with the resource

        // Suggesting the garbage collector to run
        System.gc();
        System.out.println("End of main method");
    }
}

