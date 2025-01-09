package com.corejava.oops.abstraction;

abstract class AbstractClass {

    public static String abc = "abstractVariable";
    public static int a = 0;

    // we can have Constructors
    AbstractClass() {
    }

    AbstractClass(String abc, int a) {
        System.out.println("AbstractClass constructor called");
        this.abc = abc;
        this.a = a;
    }

    public abstract void run();

    public void start() {
        System.out.println("Started ... ");
    }
}

class AbstractClassImpl extends AbstractClass {

    public static String abc = "abstractVariableImpl";
    public static int a = 1;
    public AbstractClassImpl() {

    }

    // we have to pass using super Constructors
    AbstractClassImpl(String abc, int a) {
        super(abc, a);
        System.out.println("AbstractClass constructor called");

        this.abc = abc;
        this.a = a;
    }

    @Override
    public void run() {
        System.out.println("Running ... ");
        System.out.println(abc);
        System.out.println(a);
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClassImpl();
       // AbstractClass abstractClass1 = new AbstractClassImpl("variable", 2);


        abstractClass.run();
        abstractClass.start();

       // abstractClass1.run();
       // abstractClass1.start();

    }
}
