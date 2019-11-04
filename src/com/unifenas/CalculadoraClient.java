package com.unifenas;

import java.rmi.Naming;

public class CalculadoraClient {
    public static void main(String[] args){
        try{
            Calculadora c = (Calculadora) Naming.lookup("rmi://192.168.102.93:1099/CalculadoraService");
            System.out.println("Adição : " + c.subtract(10,15));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
