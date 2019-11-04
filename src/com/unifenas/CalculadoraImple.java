package com.unifenas;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImple extends UnicastRemoteObject implements  Calculadora {
    private static final long serialVersionUID = 1L;

    protected CalculadoraImple() throws RemoteException {
        super();
    }

    public long add(long a, long b) throws RemoteException {
        return a + b;
    }

    public float subtract(float a, float b) throws RemoteException{
        return a - b;
    }

    public float multiply(float a, float b) throws RemoteException{
        return a * b;
    }

    public float Division(float a, float b) throws RemoteException{
        return a / b;
    }
}
