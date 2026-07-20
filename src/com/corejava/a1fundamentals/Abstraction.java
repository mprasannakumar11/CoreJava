package com.corejava.a1fundamentals;

/*
 * ============================================================================
 *                              ABSTRACTION
 * ============================================================================
 *
 * Definition:
 * Abstraction is the process of hiding implementation details and exposing
 * only the required functionality to the client.
 *
 * In simple words:
 *
 *          "WHAT to do" is visible
 *          "HOW it is done" is hidden
 *
 * ============================================================================
 *                    Real-Time ANZ Payment1 Processing Example
 * ============================================================================
 *
 * Business Requirement:
 *
 * ANZ supports multiple Payment1 networks:
 *
 *      1. NPP (New Payments Platform)
 *      2. SWIFT (International Payments)
 *      3. RTGS (High Value Payments)
 *
 * Mobile Banking or Internet Banking should simply initiate a Payment1
 * without knowing which Payment1 network is used internally.
 *
 * Client Code:
 *
 *      Payment1 Payment1 = new NPPPayment1();
 *      Payment1.processPayment1();
 *
 * Client only knows:
 *      -> Process Payment1
 *
 * Client DOES NOT know:
 *      -> Authentication
 *      -> Fraud Validation
 *      -> Encryption
 *      -> Payment1 Routing
 *      -> Audit Logging
 *      -> Retry Mechanism
 *      -> Database Updates
 *
 * All these implementation details are hidden.
 *
 * This is called ABSTRACTION.
 *
 * ============================================================================
 */

// Abstract class defines WHAT operations are available
abstract class Payment1 {

    // Abstract method - every Payment1 type must implement this
    abstract void processPayment1();

    // Common functionality available for all Payment1 types
    void validateRequest() {
        System.out.println("Validating Payment1 request...");
    }

    void authenticateCustomer() {
        System.out.println("Authenticating customer...");
    }
}

// NPP Payment1 Implementation
class NPPPayment1 extends Payment1 {

    @Override
    void processPayment1() {

        // Internal implementation hidden from client
        System.out.println("Fraud Check Completed");
        System.out.println("Encrypting Payment1 Message");
        System.out.println("Routing Payment1 to NPP");
        System.out.println("Publishing Audit Event");
        System.out.println("Payment1 Successfully Processed via NPP");
    }
}

// SWIFT Payment1 Implementation
class SwiftPayment1 extends Payment1 {

    @Override
    void processPayment1() {

        // Different implementation
        System.out.println("Fraud Check Completed");
        System.out.println("Generating SWIFT MT103 Message");
        System.out.println("Sending Payment1 to SWIFT Network");
        System.out.println("Publishing Audit Event");
        System.out.println("Payment1 Successfully Processed via SWIFT");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        // Mobile Banking / Internet Banking

        // Client only knows Payment1 interface
        Payment1 Payment1 = new NPPPayment1();

        // Common methods
        Payment1.validateRequest();
        Payment1.authenticateCustomer();

        // Client simply calls processPayment1()
        // It doesn't know the internal implementation
        Payment1.processPayment1();

    }
}