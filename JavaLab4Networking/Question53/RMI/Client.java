package JavaLab4Networking.Question53.RMI;


import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            SumInterface stub = (SumInterface) Naming.lookup("rmi://localhost/SumService");
            int result = stub.add(101, 20);
            System.out.println("Sum = " + result);
        } catch (Exception e) {
            System.out.println("Client Exception: " + e);
        }
    }
}
