package com.unifenas;

import java.rmi.Naming;

public class CalculadoraClient {
    public static void main(String[] args){
        try{
            Calculadora c = (Calculadora) Naming.lookup("rmi://172.16.50.45:1099/CalculadoraService");
            System.out.println("Adição : " + c.add(10,15));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
