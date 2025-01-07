package com.corejava.innerclasses;

abstract class Person {
    abstract void eat();
}

//In simple words, a class that has no name is known as an anonymous inner class in Java. It should be used if you have to override a method of class or interface. Java Anonymous inner class can be created in two ways:
//
//Class (may be abstract or concrete).
//Interface
class TestAnonymousInnerClass {
    public static void main(String args[]) {
        Person p = new Person() {
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}
