package com.corejava.security.cryptography;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*The MessageDigest class in Java provides applications with the functionality of a message digest algorithm,
such as MD5 or SHA-256. Message digests are secure one-way hash functions that
take arbitrary-sized data and output a fixed-length hash value.*/

public class MessageDigestExample {
    public static void main(String[] args) {
        try {
            // Input string to hash
            String input = "Hello, World!";

            // Create a MessageDigest instance for SHA-256
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

            // Calculate the hash (digest) of the input string
            byte[] hashBytes = messageDigest.digest(input.getBytes());

            // Convert the hash bytes to a hexadecimal string
            StringBuilder hashString = new StringBuilder();
            for (byte b : hashBytes) {
                hashString.append(String.format("%02x", b));
            }

            // Print the input and the resulting hash
            System.out.println("Input: " + input);
            System.out.println("SHA-256 Hash: " + hashString.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

