package com.unifenas;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImple extends UnicastRemoteObject implements  Calculadora {


    protected CalculadoraImple() throws RemoteException {
    }

    @Override
    public long add(long a, long b) throws RemoteException {
        return 0;
    }
}
