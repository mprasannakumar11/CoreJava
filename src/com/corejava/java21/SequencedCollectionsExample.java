package com.corejava.java21;

/*
 * ============================================================
 * SEQUENCED COLLECTIONS - JAVA 21
 * ============================================================
 *
 * Introduced in Java 21.
 *
 * ============================================================
 * PURPOSE
 * ============================================================
 *
 * Before Java 21:
 *
 * Different collections had different ways
 * to access:
 *
 * -> first element
 * -> last element
 * -> reverse order
 *
 * Example:
 *
 * LinkedList:
 * -> getFirst()
 * -> getLast()
 *
 * List:
 * -> no common standard
 *
 * Set:
 * -> difficult reverse traversal
 *
 * ============================================================
 * JAVA 21 SOLUTION
 * ============================================================
 *
 * Java introduced:
 *
 * -> SequencedCollection
 * -> SequencedSet
 * -> SequencedMap
 *
 * Provides common operations for:
 *
 * -> first element
 * -> last element
 * -> reverse view
 *
 * ============================================================
 * COMMON METHODS
 * ============================================================
 *
 * getFirst()
 * getLast()
 *
 * addFirst()
 * addLast()
 *
 * removeFirst()
 * removeLast()
 *
 * reversed()
 *
 * ============================================================
 * REAL-TIME EXAMPLE
 * ============================================================
 *
 * Payment transaction history.
 *
 * Latest transactions:
 * -> newest payment
 * -> oldest payment
 * -> reverse transaction history
 */


/*
 * ============================================================
 * IMPORTS
 * ============================================================
 */

import java.util.ArrayList;
import java.util.List;


/*
 * ============================================================
 * MAIN CLASS
 * ============================================================
 */

public class SequencedCollectionsExample {

    public static void main(String[] args) {

        /*
         * ====================================================
         * ARRAYLIST NOW SUPPORTS
         * SEQUENCED COLLECTION METHODS
         * ====================================================
         */

        List<String> transactions = new ArrayList<>();

        /*
         * ====================================================
         * ADD PAYMENTS
         * ====================================================
         */

        transactions.add("UPI Payment - Rs.500");
        transactions.add("Card Payment - Rs.2000");
        transactions.add("Wallet Payment - Rs.800");
        transactions.add("Net Banking - Rs.7000");


        /*
         * ====================================================
         * DISPLAY ALL TRANSACTIONS
         * ====================================================
         */

        System.out.println("All Transactions");
        System.out.println(transactions);


        /*
         * ====================================================
         * GET FIRST TRANSACTION
         * ====================================================
         *
         * Oldest payment.
         */

        System.out.println("\nFirst Transaction");
        System.out.println(transactions.getFirst());


        /*
         * ====================================================
         * GET LAST TRANSACTION
         * ====================================================
         *
         * Latest payment.
         */

        System.out.println("\nLast Transaction");
        System.out.println(transactions.getLast());


        /*
         * ====================================================
         * ADD FIRST
         * ====================================================
         *
         * Add urgent transaction at beginning.
         */

        transactions.addFirst("Priority Refund - Rs.10000");


        /*
         * ====================================================
         * ADD LAST
         * ====================================================
         */

        transactions.addLast("Cashback Credit - Rs.100");

        System.out.println("\nAfter addFirst/addLast");
        System.out.println(transactions);


        /*
         * ====================================================
         * REMOVE FIRST
         * ====================================================
         */

        transactions.removeFirst();

        /*
         * ====================================================
         * REMOVE LAST
         * ====================================================
         */

        transactions.removeLast();

        System.out.println("\nAfter removeFirst/removeLast");
        System.out.println(transactions);

        /*
         * ====================================================
         * REVERSED VIEW
         * ====================================================
         *
         * Latest transaction first.
         */

        System.out.println("\nReverse Order Transactions");
        System.out.println(transactions.reversed());
    }
}
