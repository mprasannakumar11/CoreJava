package com.corejava.security.securecommunication;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.security.KeyStore;

public class SSLServer {
    public static void main(String[] args) {
        int port = 8443;

        try {
            // Load the keystore containing the server certificate
            KeyStore keyStore = KeyStore.getInstance("JKS");
            keyStore.load(SSLServer.class.getResourceAsStream("/server.keystore"), "password".toCharArray());

            // Initialize the KeyManagerFactory
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
            keyManagerFactory.init(keyStore, "password".toCharArray());

            // Initialize the SSLContext
            SSLContext context = SSLContext.getInstance("TLS");
            context.init(keyManagerFactory.getKeyManagers(), null, null);

            // Create an SSLServerSocket
            SSLServerSocketFactory factory = context.getServerSocketFactory();
            SSLServerSocket serverSocket = (SSLServerSocket) factory.createServerSocket(port);

            System.out.println("SSL Server started on port " + port);

            // Accept client connections
            while (true) {
                try (var socket = serverSocket.accept()) {
                    // Read the request from the client
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String request = in.readLine();
                    System.out.println("Client request: " + request);

                    // Send a response to the client
                    PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                    out.println("Hello, Secure Client!");
                    out.flush();

                    // Close the streams
                    in.close();
                    out.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

