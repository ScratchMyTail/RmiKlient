package no.hinesna;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by christerhansen on 14.11.14.
 */
public interface Calculator extends Remote{
    int add(int a, int b) throws RemoteException;
    int sub(int a, int b) throws RemoteException;
}
