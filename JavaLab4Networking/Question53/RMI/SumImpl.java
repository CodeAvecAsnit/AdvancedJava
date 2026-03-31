package JavaLab4Networking.Question53.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SumImpl extends UnicastRemoteObject implements SumInterface {

    protected SumImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException{
        return a+b;
    }
}
