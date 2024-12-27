package com.example.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        try {
            Socket socket = new Socket("10.10.21.37", 12345);
            System.out.println("Connected to the Server....");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Hello, SERVER....!!!");

            String serverResponse = in.readLine();
            System.out.println("Received from server : " + serverResponse);

            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
