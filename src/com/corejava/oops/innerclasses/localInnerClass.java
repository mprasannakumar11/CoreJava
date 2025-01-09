package com.corejava.oops.innerclasses;

public class localInnerClass {
    private int data = 30;//instance variable

    // a class inside method
    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        localInnerClass obj = new localInnerClass();
        obj.display();
    }
}