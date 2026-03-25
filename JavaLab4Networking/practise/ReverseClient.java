package JavaLab4Networking.practise;

import java.io.*;
import java.net.*;

public class ReverseClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number to send to the server: ");
            String number = consoleInput.readLine();
            out.println(number);
            String reversedNumber = in.readLine();
            System.out.println("Reversed number received from server: " + reversedNumber);
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


