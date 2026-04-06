package JavaLab4Networking.Question38;

import java.io.*;
import java.net.*;

public class NetworkingDemo {

    public static void main(String[] args) {

        try {
            // Method 1: Full URL
            URL url1 = new URL("https:/youtube.com/");

            // Method 2: Protocol + Host + File
            URL url2 = new URL("https", "tiktok.com", "/");

            // Method 3: Base + Relative
            URL base = new URL("https://google.com/");
            URL url3 = new URL(base, "auth/login");

            System.out.println("Protocol: " + url1.getProtocol());
            System.out.println("Host: " + url1.getHost());
            System.out.println("Port: " + url1.getPort());
            System.out.println("Path: " + url1.getPath());
            System.out.println("File: " + url1.getFile());


            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(url1.openStream()));
            String line;
            int count = 0;

            while ((line = reader.readLine()) != null && count < 5) {
                System.out.println(line);
                count++;
            }

            reader.close();

            URLConnection connection = url1.openConnection();

            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLength());
            System.out.println("Date: " + connection.getDate());


            System.out.println("First complete");
            System.out.println();
            BufferedReader reader2 = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));

            count = 0;
            while ((line = reader2.readLine()) != null && count < 5) {
                System.out.println(line);
                count++;
            }

            reader2.close();
            InetAddress ip = InetAddress.getByName("google.com");
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Local Host: " + local.getHostName());
            System.out.println("Local IP: " + local.getHostAddress());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}