package com.corejava.java8.defaultmethods;

// Interface with default method
interface DefaultInterface {

    default void run() {
        System.out.println(" this is the default method in interface");
    }

    void rerun();
}

// implements without implementing run() method
public class DefaultInterfaceExample implements DefaultInterface {

    @Override
    public void rerun() {
        System.out.println(" this is the rerun method in implementation class");

    }
}

// Cilent Code
class Main {
    public static void main(String[] args) {
        DefaultInterfaceExample defaultInterfaceExample = new DefaultInterfaceExample();
        defaultInterfaceExample.run();
        defaultInterfaceExample.rerun();
    }

}
