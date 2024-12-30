package com.corejava.security.securityapis;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Base64;

public class DigitalSignatureVerificationExample {
    public static boolean verifySignature(String data, String signature, PublicKey publicKey) throws Exception {
        // Create a Signature object and initialize it with the public key
        Signature sig = Signature.getInstance("SHA256withRSA");
        sig.initVerify(publicKey);

        // Add the data to be verified
        sig.update(data.getBytes());

        // Decode the signature from Base64 and verify it
        byte[] digitalSignature = Base64.getDecoder().decode(signature);
        return sig.verify(digitalSignature);
    }

    public static void main(String[] args) {
        try {
            // Generate the key pair
            KeyPair keyPair = KeyPairGeneratorExample.main(args);
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            // Original data
            String data = "This is a secure message";

            // Sign the data
            String signature = DigitalSignatureExample.signData(data, privateKey);
            System.out.println("Digital Signature: " + signature);

            // Verify the signature
            boolean isVerified = DigitalSignatureVerificationExample.verifySignature(data, signature, publicKey);
            System.out.println("Signature verified: " + isVerified);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

