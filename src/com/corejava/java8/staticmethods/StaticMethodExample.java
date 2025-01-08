package com.corejava.java8.staticmethods;

// static interface
interface StatisMethodInterface {

    static void run() {
        System.out.println("this is the static method in Interface");
    }
}

// implements without run() method
public class StaticMethodExample implements StatisMethodInterface {

    void work() {
        System.out.println("Work method ....");
    }
}

// Client Code
class Main {
    public static void main(String[] args) {
        StaticMethodExample staticMethodExample = new StaticMethodExample();
        staticMethodExample.work();

        // calling method without creating instance of implementation class
        StatisMethodInterface.run();
    }
}