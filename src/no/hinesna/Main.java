package no.hinesna;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class Main {

    public static void main(String[] args) throws Exception {
        String serverUrl = "rmi://localhost/AddServer";
        Calculator calc = (Calculator) Naming.lookup(serverUrl);
        System.out.println(calc.add(2,5));
    }
}
