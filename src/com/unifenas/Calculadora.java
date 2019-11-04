package com.unifenas;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    public float add(float a, float b) throws RemoteException;
    public float subtract(float a, float b) throws RemoteException;
    public float multiply(float a, float b) throws RemoteException;
    public float Division(float a, float b) throws RemoteException;
}
