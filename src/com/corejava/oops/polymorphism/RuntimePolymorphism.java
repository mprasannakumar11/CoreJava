package com.corejava.oops.polymorphism;

//Also known as Method Overriding also known as Dynamic Binding (Late Binding)
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Outputs: Woof
        myCat.makeSound(); // Outputs: Meow
    }

}
