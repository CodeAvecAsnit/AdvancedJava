package JavaLab4Networking.Question39;

import java.io.*;
import java.net.*;

    public class TCPServer {
        public static void main(String[] args) {
            try {
                ServerSocket serverSocket = new ServerSocket(5000);
                System.out.println("Server is waiting for client...");

                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");

                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

                String message;

                while (true) {
                    message = input.readLine();
                    if (message.equalsIgnoreCase("exit")) {
                        System.out.println("Client disconnected.");
                        break;
                    }
                    System.out.println("Client: " + message);
                    System.out.print("Server: ");
                    message = console.readLine();
                    output.println(message);

                    if (message.equalsIgnoreCase("exit")) break;
                }

                socket.close();
                serverSocket.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
