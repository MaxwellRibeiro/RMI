package com.unifenas;

import java.rmi.Naming;
import java.util.Scanner;

public class CalculadoraClient {
    public static void main(String[] args){
        try{
            Calculadora c = (Calculadora) Naming.lookup("rmi://192.168.102.93:1099/CalculadoraService");

            Scanner sc = new Scanner(System.in);

            int opcao = 0;

            do {
                System.out.println("----------MENU----------");
                System.out.println("[1] Soma");
                System.out.println("[2] Subtração");
                System.out.println("[3] Multiplicação");
                System.out.println("[4] Divisão");
                System.out.println("------------------------");
                System.out.println("Escolha uma opção: ");
                opcao = sc.nextInt();
                System.out.println("------------------------");

                if(opcao < 1 || opcao > 4){
                    System.out.println("Não existe esta opção, escolha um nº entre 1 à 4");
                    System.out.println("");
                }

            }while (opcao < 1 || opcao > 4);


            System.out.println("Digite o 1º nº:");
            float num1 = sc.nextFloat();
            System.out.println("Digite o 2º nº:");
            float num2 = sc.nextFloat();

            switch (opcao){
                case 1:
                    System.out.println("Soma: " + c.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Subtração: " + c.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Multiplicação: " + c.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Divisão: " + c.Division(num1, num2));
                    break;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
