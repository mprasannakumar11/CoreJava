package com.corejava.java21;

/*
 * ============================================================
 * RECORD PATTERNS - JAVA 21
 * ============================================================
 *
 * Introduced as FINAL feature in Java 21.
 *
 * ============================================================
 * PURPOSE
 * ============================================================
 *
 * Record Patterns allow:
 *
 * -> Type checking
 * -> Automatic casting
 * -> Automatic extraction of record values
 *
 * in a single statement.
 *
 * Reduces boilerplate code significantly.
 *
 * ============================================================
 * BEFORE RECORD PATTERNS
 * ============================================================
 *
 * Old approach:
 *
 * if (obj instanceof Payment payment) {
 *
 *     String name = payment.customerName();
 *     double amount = payment.amount();
 * }
 *
 * ============================================================
 * WITH RECORD PATTERNS
 * ============================================================
 *
 * Java automatically:
 *
 * -> checks type
 * -> casts object
 * -> extracts fields
 *
 * Example:
 *
 * if (obj instanceof Payment(String customerName,
 *                            double amount))
 *
 * ============================================================
 * REAL-TIME EXAMPLE
 * ============================================================
 *
 * Payment system receives:
 *
 * -> UPI Payments
 * -> Card Payments
 * -> Wallet Payments
 *
 * Each payment contains:
 *
 * -> account information
 * -> amount
 *
 * Java extracts values directly from records.
 */


/*
 * ============================================================
 * PAYMENT RECORDS
 * ============================================================
 *
 * Record automatically creates:
 *
 * -> constructor
 * -> getters
 * -> toString()
 * -> equals()
 * -> hashCode()
 */

record UpiPayment1(String upiId, double amount) {}
record CardPayment1(String cardNumber, double amount) {}
record WalletPayment1(String walletName, double amount) {}


/*
 * ============================================================
 * MAIN CLASS
 * ============================================================
 */

public class RecordPatternExample {

    public static void main(String[] args) {

        /*
         * Different payment objects.
         */

        Object payment1 =
                new UpiPayment1("prasanna@upi", 2500);
        Object payment2 =
                new CardPayment1("1234-5678-9999", 8000);
        Object payment3 =
                new WalletPayment1("Paytm", 1200);


        /*
         * Process payments.
         */

        processPayment(payment1);
        processPayment(payment2);
        processPayment(payment3);
    }


    /*
     * ============================================================
     * RECORD PATTERN MATCHING
     * ============================================================
     */

    public static void processPayment(Object payment) {

        switch (payment) {

            /*
             * ====================================================
             * UPI PAYMENT RECORD PATTERN
             * ====================================================
             *
             * Java automatically:
             *
             * Step 1:
             * -> checks object type
             *
             * payment instanceof UpiPayment
             *
             * Step 2:
             * -> casts automatically
             *
             * Step 3:
             * -> extracts record values
             *
             * String upiId
             * double amount
             */

            case UpiPayment1(String upiId,
                            double amount) -> {
                System.out.println("\nUPI Payment");
                System.out.println("UPI ID  : " + upiId);
                System.out.println("Amount  : " + amount);
            }


            /*
             * ====================================================
             * CARD PAYMENT RECORD PATTERN
             * ====================================================
             */

            case CardPayment1(String cardNumber,
                             double amount) -> {

                System.out.println("\nCard Payment");
                System.out.println("Card No : " + cardNumber);
                System.out.println("Amount  : " + amount);

                /*
                 * High value payment check.
                 */

                if (amount > 5000) {
                    System.out.println("High Value Card Payment");
                }
            }


            /*
             * ====================================================
             * WALLET PAYMENT RECORD PATTERN
             * ====================================================
             */

            case WalletPayment1(String walletName, double amount) -> {
                System.out.println("Wallet Payment");
                System.out.println("Wallet  : " + walletName);
                System.out.println("Amount  : " + amount);
            }


            /*
             * ====================================================
             * DEFAULT CASE
             * ====================================================
             */

            default -> System.out.println("Unknown Payment Type");
        }
    }
}

/*
 * ============================================================
 * IMPORTANT DIFFERENCE
 * ============================================================
 *
 * NORMAL PATTERN MATCHING:
 *
 * case UpiPayment upi ->
 *
 * Gives complete object.
 *
 * Access values using:
 *
 * upi.upiId()
 * upi.amount()
 *
 * ============================================================
 * RECORD PATTERN MATCHING:
 * ============================================================
 *
 * case UpiPayment(String upiId,
 *                 double amount) ->
 *
 * Directly extracts values from record.
 *
 * No getter calls needed.
 */


/*
 * ============================================================
 * ADVANTAGES
 * ============================================================
 *
 * -> Less boilerplate code
 *
 * -> Cleaner object extraction
 *
 * -> Better readability
 *
 * -> Safer type handling
 *
 * -> Excellent for DTO processing
 *
 * -> Useful in microservices and payments
 *
 * ============================================================
 * COMMON ENTERPRISE USAGE
 * ============================================================
 *
 * -> Payment gateways
 *
 * -> Kafka event consumers
 *
 * -> Banking applications
 *
 * -> API request handling
 *
 * -> JSON mapped DTO processing
 *
 * -> Order processing systems
 *
 * ============================================================
 * JAVA VERSION
 * ============================================================
 *
 * Record Patterns are FINAL in:
 *
 * -> Java 21
 *
 * ============================================================
 */
