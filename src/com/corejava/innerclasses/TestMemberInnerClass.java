package com.corejava.innerclasses;

//A non-static class that is created inside a class but outside a method is called member inner class.
// It is also known as a regular inner class. It can be declared with access modifiers like public, default, private, and protected.
public class TestMemberInnerClass {

    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String args[]) {
        TestMemberInnerClass obj = new TestMemberInnerClass();
        TestMemberInnerClass.Inner in = obj.new Inner();
        in.msg();
    }
}
