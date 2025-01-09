package com.corejava.oops.encapsulation;

class Person {
    // Private fields
    /*The fields name and age are declared as private, meaning they cannot be accessed directly from outside the Person class. */
    private String name;
    private int age;

    // setters and getters to modify the data
    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person();

        // Set name and age using setter methods
        person.setName("John Doe");
        person.setAge(30);

        // Get name and age using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempt to set a negative age
        person.setAge(-5); // Outputs: Age must be positive
    }

    /*  Control: Encapsulation allows you to control how the data in your objects is accessed and modified.
        Validation: You can add validation logic in setter methods to ensure that the data is correct.
        Maintainability: Changes to the implementation details of a class can be made without affecting code that uses the class.
        Security: Encapsulation helps protect the internal state of an object from unintended interference and misuse. */
}

