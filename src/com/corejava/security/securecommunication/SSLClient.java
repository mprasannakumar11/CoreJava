package com.corejava.security.securecommunication;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SSLClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8443;

        try {
            // Get the SSLSocketFactory
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();

            // Create an SSLSocket
            SSLSocket socket = (SSLSocket) factory.createSocket(host, port);

            // Start the handshake
            socket.startHandshake();

            // Send a request to the server
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            out.println("Hello, Secure World!");
            out.flush();

            // Read the response from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = in.readLine();
            System.out.println("Server response: " + response);

            // Close the streams and socket
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

