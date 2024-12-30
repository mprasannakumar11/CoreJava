package com.corejava.java8.staticmethods;

public class StaticMethodExample implements StatisMethodInterface {

    void work() {
        System.out.println("Work method ....");
    }
}

class Main {
    public static void main(String[] args) {
        StaticMethodExample staticMethodExample = new StaticMethodExample();
        staticMethodExample.work();

        // calling method without creating instance of implementation class
        StatisMethodInterface.run();
    }
}