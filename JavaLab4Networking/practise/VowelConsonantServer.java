package JavaLab4Networking.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class VowelConsonantServer {

    public static char[] VOWELS = {'a','e','i','o','u'};

    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server is listening of port 8080");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            String word = in.readLine();
            int strLen = word.length();
            int vowels = totalVowels(word);
            int consonants = strLen - vowels;


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int totalVowels(String word){
        int count = 0;
        for(char x : word.toCharArray()){
            if(isVowel(x)) ++count;
        }
        return count;

    }

    public static boolean isVowel(char x ){
        for(char v : VOWELS){
            if(v==x) return true;
        }
        return false;
    }
}
