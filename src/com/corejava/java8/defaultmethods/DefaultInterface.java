package com.corejava.java8.defaultmethods;

public interface DefaultInterface {

    default void run() {
        System.out.println(" this is the default method in interface");
    }

    void rerun();
}
