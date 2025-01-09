package com.corejava.cloning;

class AddressO implements Cloneable {
    String city;

    AddressO(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Deep copy for Address
    }
}

class PersonO implements Cloneable {
    String name;
    AddressO address;

    PersonO(String name, AddressO address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PersonO cloned = (PersonO) super.clone();
        cloned.address = (AddressO) address.clone(); // Deep copy for Address
        return cloned;
    }
}

/* A deep copy of an object copies the object and all the objects that are referenced by the object, recursively.
This means that the new object is completely independent of the original object,
and changes to the copied object do not affect the original object and vice versa. */

public class DeepCopyExample {
    public static void main(String[] args) {
        AddressO address = new AddressO("New York");
        PersonO person1 = new PersonO("John", address);

        try {
            PersonO person2 = (PersonO) person1.clone();
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
/* Deep Copy: Copies the object and all referenced objects, creating independent objects.*/

