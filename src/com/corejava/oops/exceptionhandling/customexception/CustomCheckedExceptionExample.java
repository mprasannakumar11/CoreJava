package com.corejava.oops.exceptionhandling.customexception;

import java.io.IOException;

public class CustomCheckedExceptionExample {
    public static void main(String[] args) throws IOException {

        try {
            // custom checked Exception
            throw new CustomCheckedException("This is Custom Checked Exception");
        } catch (CustomCheckedException e) {
            System.err.println("Caught Customer Exception:" + e.getMessage());
        }
        // custom unchecked Exception
        throw new CustomUnCheckedException("this is Custom UnChecked Exception");
    }

}
