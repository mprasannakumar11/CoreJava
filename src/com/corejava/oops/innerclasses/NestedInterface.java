package com.corejava.innerclasses;

//The nested interface must be public if it is declared inside the interface, but it can have any access modifier if declared within the class.
//Nested interfaces are declared static
interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

class NestedInterface implements Showable.Message {
    public void msg() {
        System.out.println("Hello nested interface");
    }

    public static void main(String args[]) {
        Showable.Message message = new NestedInterface();//upcasting here
        message.msg();
    }
}
