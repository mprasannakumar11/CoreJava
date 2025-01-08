package com.corejava.designpattrens;

class Singleton {
    // Private static variable of the same class that is the only instance of the class
    private static Singleton instance;

    // Private constructor to restrict instantiation of the class from other classes
    private Singleton() {
        // Initialization code (if any)
    }

    // Public static method that returns the instance of the class, creating it if it does not exist
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

public class SingletonPattrenExample {
    public static void main(String[] args) {
        // Get the only instance of Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Display the hashcodes to show that both references point to the same instance
        System.out.println("Singleton instance 1 hashcode: " + singleton1.hashCode());
        System.out.println("Singleton instance 2 hashcode: " + singleton2.hashCode());

        // Check if both references are equal
        if (singleton1 == singleton2) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("The references point to different instances.");
        }
    }
}
