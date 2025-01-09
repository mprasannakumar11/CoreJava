package com.corejava.cloning;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

/* A shallow copy of an object copies the object's reference types and primitives,
but not the objects referred to by those references. This means that the new object will have
references to the same objects as the original object. If the original object has references to other objects,
both the original and the copied objects will point to the same referenced objects. */

public class ShallowCopyExample {
    public static void main(String[] args) {
        Address address = new Address("New York");
        Person person1 = new Person("John", address);

        try {
            Person person2 = (Person) person1.clone();
            System.out.println(person1.name + " lives in " + person1.address.city);
            System.out.println(person2.name + " lives in " + person2.address.city);

            person2.address.city = "San Francisco"; // Modifying the address in the cloned object
            System.out.println(person1.name + " lives in " + person1.address.city);
            System.out.println(person2.name + " lives in " + person2.address.city);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
/* Shallow Copy: Copies the object's references, leading to shared references. */