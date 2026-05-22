package com.corejava.a2oops.Inheritance;

// Inheritance example

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Dog dog = new Dog();

        // Inherited method
        dog.sound();

        // Own method
        dog.bark();
    }
}