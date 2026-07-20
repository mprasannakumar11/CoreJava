package com.corejava.a1fundamentals;

/*
 * ============================================================================
 *                              INHERITANCE
 * ============================================================================
 *
 * Definition:
 * Inheritance is the process by which one class acquires the properties
 * and behaviors of another class.
 *
 * In simple words:
 *
 *          Parent Class (Common Functionality)
 *                      ↑
 *                      |
 *          Child Class (Specific Functionality)
 *
 * ============================================================================
 *                  Real-Time ANZ Payment Processing Example
 * ============================================================================
 *
 * ANZ supports multiple payment types:
 *
 *      1. NPP Payments
 *      2. SWIFT Payments
 *      3. RTGS Payments
 *
 * Every payment has some common functionality:
 *
 *      ✔ Validate Payment
 *      ✔ Authenticate Customer
 *      ✔ Audit Transaction
 *
 * Instead of writing the same code in every payment class,
 * we create a parent class called Payment.
 *
 * Child classes inherit these common methods and add
 * their own specific functionality.
 *
 *                          Payment
 *                              |
 *          -------------------------------------
 *          |                  |                |
 *      NPPPayment       SwiftPayment     RTGSPayment
 *
 * ============================================================================
 *
 * Benefits:
 *
 * ✔ Code Reusability
 * ✔ Less Duplicate Code
 * ✔ Easy Maintenance
 * ✔ Extensible Design
 *
 * ============================================================================
 */

// Parent Class

class Payment2 {

    // Common functionality for all payment types

    void validatePayment() {
        System.out.println("Validating Payment Request...");
    }

    void authenticateCustomer() {
        System.out.println("Authenticating Customer...");
    }

    void auditTransaction() {
        System.out.println("Publishing Audit Event...");
    }
}

// Child Class inherits Payment

class NPPPayment extends Payment2 {

    // NPP specific functionality

    void processNPPPayment() {
        System.out.println("Processing Payment via NPP Network...");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        // Creating child object

        NPPPayment payment = new NPPPayment();

        // Inherited methods from Payment class

        payment.validatePayment();
        payment.authenticateCustomer();
        payment.auditTransaction();

        // Child class own method

        payment.processNPPPayment();
    }
}