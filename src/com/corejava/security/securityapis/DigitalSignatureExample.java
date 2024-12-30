package com.corejava.security.securityapis;

import java.security.PrivateKey;
import java.security.Signature;
import java.util.Base64;

public class DigitalSignatureExample {
    public static String signData(String data, PrivateKey privateKey) throws Exception {
        // Create a Signature object and initialize it with the private key
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);

        // Add the data to be signed
        signature.update(data.getBytes());

        // Calculate the signature
        byte[] digitalSignature = signature.sign();

        // Return the signature as a Base64 encoded string
        return Base64.getEncoder().encodeToString(digitalSignature);
    }
}

