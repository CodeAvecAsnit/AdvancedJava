package JavaLab4Networking.Question39;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        try{
            Socket sc = new Socket("localhost",5000);
            System.out.println("connected");

            BufferedReader input = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);

            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String message;

            while(true){
                System.out.println(" Client : ");
                message = console.readLine();
                pw.println(message);

                if(message.equalsIgnoreCase("exit")) break;
                message = input.readLine();
                if(message.equalsIgnoreCase("exit")){
                    System.out.println("Server Disconnected.");
                    break;
                }
                System.out.println("Server "+message);
            }
            sc.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
