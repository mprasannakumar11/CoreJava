package com.corejava.a1fundamentals;

// Abstraction using abstract class
abstract class Vehicle {

    // Abstract method (only declaration)
    abstract void start();

    // Normal method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {

    // Providing implementation
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        vehicle.start();
        vehicle.stop();
    }
}