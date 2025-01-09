package com.corejava.oops.classesandobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class MyClass {

    public static MyClass createInstance() {
        return null;
    }
}


public class WaysToCreateObject {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {

        //Using the new Keyword
        MyClass obj = new MyClass();

        //Using Reflection
        MyClass objReflection = (MyClass) Class.forName("MyClass").newInstance();

        //Using Cloning  //clone deprecated
        /* The clone() method itself is not deprecated in any specific Java version,
        but it is considered bad practice and discouraged due to its design flaws and the complexity it introduces */

        /*Shallow copy: It only creates a shallow copy of the object,
        which means that if the object contains references to other objects, those references are copied, not the objects themselves */
        MyClass obj1 = new MyClass();
        //MyClass obj2 = (MyClass) obj1.clone();

        //Using Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.ser"));
        MyClass objDeserialization = (MyClass) in.readObject();

        //Using Factory Methods
        MyClass objFactory = MyClass.createInstance();

        //Using Builder Pattern  //The Builder pattern is a creational design pattern that provides a way to construct complex objects step by step.
        //MyClass objBuilder = new MyClass.Builder().setValue(10).build();


    }
}
