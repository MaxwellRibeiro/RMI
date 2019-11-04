package com.unifenas;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    public long add(long a, long b) throws RemoteException;
    public float subtract(float a, float b) throws RemoteException;
    public float multiply(float a, float b) throws RemoteException;
    public float Division(float a, float b) throws RemoteException;
}
