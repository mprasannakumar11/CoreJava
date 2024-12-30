package com.corejava.security.securityapis;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class KeyPairGeneratorExample {
    public static KeyPair main(String[] args) {
        KeyPair keyPair = null;
        try {
            // Create a KeyPairGenerator for RSA
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");

            // Initialize the key pair generator
            keyPairGen.initialize(2048);

            // Generate the key pair
            keyPair = keyPairGen.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            // Print the keys
            System.out.println("Private Key: " + privateKey);
            System.out.println("Public Key: " + publicKey);


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return keyPair;
    }
}

