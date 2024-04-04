package org.example.N_26_Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class main {
    public static void main(String[] args) {
        String hostName = "10.10.214.25";
        int port = 8080;

        try {
            Socket socket = new Socket(hostName, port);
            System.out.println("Server running in hostname " + hostName + "port " + port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader output = new BufferedReader(new InputStreamReader(System.in));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
