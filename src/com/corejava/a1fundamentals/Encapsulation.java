package com.corejava.a1fundamentals;

/*
 * ============================================================================
 *                              ENCAPSULATION
 * ============================================================================
 *
 * Definition:
 * Encapsulation is the process of hiding data using private variables
 * and providing controlled access through public methods (getters/setters).
 *
 * ============================================================================
 *                  Real-Time ANZ Payment Processing Example
 * ============================================================================
 *
 * Scenario:
 *
 * A customer initiates a payment from ANZ Mobile Banking.
 *
 * Request:
 *
 * {
 *    "customerId":"C10001",
 *    "fromAccount":"123456789",
 *    "toAccount":"987654321",
 *    "amount":5000,
 *    "currency":"AUD"
 * }
 *
 * Security Requirement:
 *
 * - No service should directly modify payment amount.
 * - No service should directly change account numbers.
 * - All updates must go through business validations.
 *
 * Therefore,
 * PaymentRequest hides its internal data using private variables.
 *
 * Client Code:
 *
 *      paymentRequest.setAmount(5000);
 *      paymentRequest.getAmount();
 *
 * Client CANNOT do:
 *
 *      paymentRequest.amount = -1000;   // Not Allowed
 *
 * This is Encapsulation.
 *
 * ============================================================================
 */

class PaymentRequest {

    // Hidden Data

    private String customerId;
    private String fromAccount;
    private String toAccount;
    private double amount;
    private String currency;

    // Controlled Write Access

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // Business Validation

    public void setAmount(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be greater than zero");
        }

        this.amount = amount;
    }

    // Controlled Read Access

    public String getCustomerId() {
        return customerId;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        PaymentRequest paymentRequest = new PaymentRequest();

        // Setting values through public methods

        paymentRequest.setCustomerId("C10001");
        paymentRequest.setFromAccount("123456789");
        paymentRequest.setToAccount("987654321");
        paymentRequest.setAmount(5000);
        paymentRequest.setCurrency("AUD");

        // Reading values through getters

        System.out.println("Customer Id : " + paymentRequest.getCustomerId());
        System.out.println("From Account : " + paymentRequest.getFromAccount());
        System.out.println("To Account : " + paymentRequest.getToAccount());
        System.out.println("Amount : " + paymentRequest.getAmount());
        System.out.println("Currency : " + paymentRequest.getCurrency());

        /*
         * The following is NOT allowed because variables are private.
         *
         * paymentRequest.amount = -1000;
         * paymentRequest.fromAccount = "111111111";
         *
         * The object itself controls how data is accessed and modified.
         */
    }
}