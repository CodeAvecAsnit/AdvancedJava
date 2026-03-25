package JavaLab4Networking.practise;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPServer{
    public static void main(String[] args) throws SocketException , UnknownHostException {
        DatagramSocket socket = new DatagramSocket(9001);
        InetAddress ip = InetAddress.getByName("localhost");

    }
}
