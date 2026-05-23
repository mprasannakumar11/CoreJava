package com.corejava.java21;

/*
 * ============================================================
 * PATTERN MATCHING FOR SWITCH - JAVA 21
 * ============================================================
 *
 * Introduced as FINAL feature in Java 21.
 *
 * ============================================================
 * PURPOSE
 * ============================================================
 *
 * Makes switch smarter.
 *
 * Earlier switch supported:
 * -> int
 * -> String
 * -> enum
 *
 * Java 21 switch supports:
 * -> object types
 * -> pattern matching
 * -> conditions
 *
 * ============================================================
 * REAL-TIME EXAMPLE
 * ============================================================
 *
 * Payment application receives:
 * -> UPI payment
 * -> Card payment
 * -> Wallet payment
 * -> Bank transfer
 *
 * Different object types processed
 * using switch pattern matching.
 */


/*
 * ============================================================
 * PAYMENT CLASSES
 * ============================================================
 */

class UpiPayment {

    String upiId;
    UpiPayment(String upiId) {
        this.upiId = upiId;
    }
}

class CardPayment {

    String cardNumber;
    CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}

class WalletPayment {

    String walletName;
    WalletPayment(String walletName) {
        this.walletName = walletName;
    }
}

/*
 * ============================================================
 * MAIN CLASS
 * ============================================================
 */

public class PatternMatchingSwitchExample {

    public static void main(String[] args) {

        /*
         * Different payment objects.
         */

        Object payment1 = new UpiPayment("prasanna@upi");

        Object payment2 = new CardPayment("1234-5678-9999");

        Object payment3 = new WalletPayment("Paytm");


        /*
         * Process payments.
         */

        processPayment(payment1);
        processPayment(payment2);
        processPayment(payment3);
    }


    /*
     * ============================================================
     * SWITCH PATTERN MATCHING
     * ============================================================
     */

    public static void processPayment(Object payment) {

        switch (payment) {

            /*
             * ====================================================
             * TYPE CHECK + CAST AUTOMATICALLY
             * ====================================================
             *
             * Java checks:
             * -> Is payment UpiPayment?
             *
             * If YES:
             * -> Automatically casts
             * -> Stores in variable 'upi'
             */

            case UpiPayment upi ->
                    System.out.println("UPI Payment Processing: " + upi.upiId);

            /*
             * ====================================================
             * CARD PAYMENT
             * ====================================================
             */

            case CardPayment card ->
                    System.out.println("Card Payment Processing: " + card.cardNumber);

            /*
             * ====================================================
             * WALLET PAYMENT
             * ====================================================
             */

            case WalletPayment wallet ->
                    System.out.println("Wallet Payment Processing: " + wallet.walletName);

            /*
             * ====================================================
             * DEFAULT CASE
             * ====================================================
             */

            default -> System.out.println("Unknown Payment Type");
        }
    }
}
