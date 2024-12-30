package com.corejava.java8;

import java.util.Optional;


public class OptionalExample {

    public static void main(String[] args) {

        String value = "notNull";

        //it can not handle null pointer exception
        Optional<String> optionalS = Optional.of(value);

        //ifPresent
        optionalS.ifPresent(v -> System.out.println("Value:" + v));
        /*---------------------------------------*/

        Student student1 = new Student("Prasanna", 25, null);

        //ofnullable handle null pointers to avoid null poiner exception
        Optional<String> optionalS2 = Optional.ofNullable(student1.getRollNo());

        //orElse provide default value
        System.out.println("Roll Number: " + optionalS2.orElse("12345"));

        // if present else not present
        optionalS2.ifPresentOrElse(
                v -> System.out.println("Value Present"),
                () -> System.out.println("Value not prasent"));

        // if else throw Exception
        optionalS2.orElseThrow(() -> new RuntimeException(("Value not prasent")));


    }
}


class Student {
    String name;
    Integer age;
    String rollNo;

    public Student(String name, Integer age, String rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
