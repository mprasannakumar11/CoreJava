package com.corejava.oops.exceptionhandling.customexception;

public class CustomUnCheckedException extends RuntimeException {

    public CustomUnCheckedException() {
    }

    public CustomUnCheckedException(String message) {
        super(message);
    }

    public CustomUnCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomUnCheckedException(Throwable cause) {
        super(cause);
    }
}
