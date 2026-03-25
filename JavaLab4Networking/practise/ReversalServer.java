package JavaLab4Networking.practise;

import java.io.*;
import java.net.*;

public class ReversalServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server is listening on port 8080...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String number = in.readLine();
            System.out.println("Received number from client: " + number);
            String reversedNumber = new StringBuilder(number).reverse().toString();
            out.println(reversedNumber);
            System.out.println("Sent reversed number to client: " + reversedNumber);
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

