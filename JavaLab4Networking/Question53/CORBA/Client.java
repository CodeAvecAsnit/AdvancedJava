package JavaLab4Networking.Question53.CORBA;

import HelloApp.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;

class Client {
    public static void main(String args[]) {
        try {
            ORB orb = ORB.init(args, null);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "Hello";
            Hello helloImpl = HelloHelper.narrow(ncRef.resolve_str(name));

            System.out.println(helloImpl.sayHello());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}