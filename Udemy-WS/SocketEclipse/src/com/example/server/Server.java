package com.example.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException{

        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is waiting for connection.....");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected....!!!");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String clientMessage = in.readLine();
            System.out.println("Recieved from client : " + clientMessage);

            out.println("Hello from the server.....!!!");

            clientSocket.close();
            serverSocket.close();
        }



    }
}
