package com.corejava.security.cryptography;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class KeyPairGenerationExample {
    public static void main(String[] args) {
        try {
            // Create a KeyPairGenerator object for RSA
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

            // Initialize the key pair generator with a key size
            keyPairGenerator.initialize(2048);

            // Generate the key pair
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PublicKey publicKey = keyPair.getPublic();
            PrivateKey privateKey = keyPair.getPrivate();

            // Encode the keys to Base64 for display
            String publicKeyString = Base64.getEncoder().encodeToString(publicKey.getEncoded());
            String privateKeyString = Base64.getEncoder().encodeToString(privateKey.getEncoded());

            // Print the keys
            System.out.println("Public Key: " + publicKeyString);
            System.out.println("Private Key: " + privateKeyString);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static class AESCryptographyExample {
        // Method to generate a new AES secret key
        public static SecretKey generateKey(int n) throws Exception {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(n);
            SecretKey secretKey = keyGenerator.generateKey();
            return secretKey;
        }

        // Method to encrypt a plaintext string
        public static String encrypt(String plaintext, SecretKey secretKey) throws Exception {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        }

        // Method to decrypt an encrypted string
        public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes);
        }

        public static void main(String[] args) {
            try {
                // Generate a new AES key
                SecretKey secretKey = generateKey(256);

                // Original plaintext
                String originalText = "Hello, World!";
                System.out.println("Original Text: " + originalText);

                // Encrypt the plaintext
                String encryptedText = encrypt(originalText, secretKey);
                System.out.println("Encrypted Text: " + encryptedText);

                // Decrypt the encrypted text
                String decryptedText = decrypt(encryptedText, secretKey);
                System.out.println("Decrypted Text: " + decryptedText);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

