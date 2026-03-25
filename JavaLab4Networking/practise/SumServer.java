package JavaLab4Networking.practise;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SumServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9876);
        byte[] receiveData = new byte[1024];
        byte[] sendData;

        System.out.println("Server is running...");
        while (true) {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            String received = new String(receivePacket.getData(), 0, receivePacket.getLength());
            String[] numbers = received.split(",");
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);
            int sum = num1 + num2;
            System.out.println("Received: " + num1 + " and " + num2 + ", Sum: " + sum);
            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();
            String result = "Sum = " + sum;
            sendData = result.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
            socket.send(sendPacket);
        }
    }
}
