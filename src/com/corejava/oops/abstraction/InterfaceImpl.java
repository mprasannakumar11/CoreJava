package com.corejava.oops.abstraction;

interface Shape {
    // by default static and final
    public static final String colour = "Red";
    public static final int size = 0;

    // cannot have construtors
    public void shape();
}

class Circle implements Shape {

    @Override
    public void shape() {
        System.out.println("Circle");
        System.out.println(Shape.colour);
        System.out.println(Shape.size);


    }
}


public class InterfaceImpl {
    public static void main(String[] args) {

        Shape shape = new Circle();
        shape.shape();

    }

}
