package application;

import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.ContaSalario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("-----BANCO ABC PAULISTA-----");
            System.out.println(" 1 - CONTA CORRENTE");
            System.out.println(" 2 - CONTA POUPANÇA");
            System.out.println(" 3 - CONTA SALÁRIO");
            System.out.println(" 0 - SAIR");
            option = sc.nextInt();
            process(option);
        } while(option !=0);


    }
    public static void process(int option){
        Scanner sc = new Scanner(System.in);
        switch(option){
            case 1:{
                System.out.print("Qual valor deseja sacar? R$ ");

                sc = new Scanner(System.in);
                double vSaque = sc.nextDouble();
                double sacar;
                sacar = vSaque;
                ContaCorrente cc1 = new ContaCorrente(22,"AA", 1,100.00,1000.00, sacar);
                System.out.println(cc1.toString());
                break;
            }
            case 2:{
                ContaPoupanca p1 = new ContaPoupanca(33,"BB", 2, 10.00,20,0.05);
                System.out.println(p1.toString());
                ;
                break;
            }
            case 3:{
                saque();
                break;
            }
            case 0:{
                System.out.println("Obrigado pela preferência, volte sempre.");
            }
        }

    }

    public static void saque() {
            System.out.print("Qual valor deseja sacar? R$");
            Scanner sc = new Scanner(System.in);
            double vSaque = sc.nextDouble();
            double sacar;
            sacar = vSaque;
            ContaSalario c1 = new ContaSalario(33, "cc", 3, 1000.00, sacar);

            System.out.println(c1.toString());
            System.exit(0);

    }
}
