package com.corejava.java8.defaultmethods;

public class DefaultInterfaceExample implements DefaultInterface {

    @Override
    public void rerun() {
        System.out.println(" this is the rerun method in implementation class");

    }
}

class Main {
    public static void main(String[] args) {
        DefaultInterfaceExample defaultInterfaceExample = new DefaultInterfaceExample();
        defaultInterfaceExample.run();
        defaultInterfaceExample.rerun();
    }

}
