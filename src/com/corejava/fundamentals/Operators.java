package com.corejava.fundamentals;


import java.util.Arrays;

class A {
    void run() {
        System.out.println("Running...");
    }
}

public class Operators {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        A a = new A();

        a.run();

        Object obj = Class.forName("A").newInstance();

        System.out.println(Arrays.toString(obj.getClass().getMethods()));

    }
}
