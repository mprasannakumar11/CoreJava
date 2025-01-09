package com.corejava.misc;

public abstract class AbstractClassWithMain {
    public static void main(String[] args) {
        System.out.println("Main method in abstract class");
    }
}

class ConcreteClass extends AbstractClassWithMain {
    // Other methods and fields specific to ConcreteClass
}

