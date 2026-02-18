package JavaLab4Networking.Question30;

import java.net.*;

public class NetworkingDemo {

    public static void main(String[] args) {

        try {
            URL url1 = new URL("https://www.example.com:443/index.html?name=abc");

            URL url2 = new URL("https", "www.example.com", "/index.html");

            URL url3 = new URL("https", "www.example.com", 443, "/index.html");


            System.out.println("Protocol: " + url1.getProtocol());
            System.out.println("Host: " + url1.getHost());
            System.out.println("Port: " + url1.getPort());
            System.out.println("Default Port: " + url1.getDefaultPort());
            System.out.println("Path: " + url1.getPath());
            System.out.println("Query: " + url1.getQuery());
            System.out.println("File: " + url1.getFile());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

