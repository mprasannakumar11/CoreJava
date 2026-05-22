package com.corejava.a1fundamentals;

// Polymorphism example

class Payment {

    void pay() {
        System.out.println("Payment processing");
    }
}

class CreditCardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UpiPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UpiPayment();

        payment1.pay();
        payment2.pay();
    }
}