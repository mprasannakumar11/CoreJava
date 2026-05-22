package com.corejava.a2oops.constructors;

// Constructor Example in Java

class Student {

    // Instance variables
    String name;
    int age;

    /*
     * Constructor
     * -------------
     * A constructor is a special method used to initialize objects.
     *
     * Rules:
     * 1. Constructor name must be same as class name.
     * 2. Constructor does not have return type (not even void).
     * 3. Constructor is automatically called when object is created.
     */

    // Default constructor
    Student() {

        /*
         * This constructor has no parameters.
         * It is called when object is created without values.
         */

        name = "Unknown";
        age = 0;

        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Student(String studentName, int studentAge) {

        /*
         * This constructor accepts values while creating object.
         * Used to initialize object with custom data.
         */

        name = studentName;
        age = studentAge;

        System.out.println("Parameterized constructor called");
    }

    // Method to display student details
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class Constructor {

    public static void main(String[] args) {

        /*
         * Object Creation
         * ----------------
         * new Student()
         * -> Memory is allocated
         * -> Constructor is automatically executed
         */

        // Calling default constructor
        Student student1 = new Student();

        student1.display();

        System.out.println();

        // Calling parameterized constructor
        Student student2 = new Student("Prasanna", 25);

        student2.display();
    }
}