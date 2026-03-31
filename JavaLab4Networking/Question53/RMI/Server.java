package JavaLab4Networking.Question53.RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            SumImpl obj = new SumImpl();
            Naming.rebind("SumService", obj);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println("Server Exception: " + e);
        }
    }
}

