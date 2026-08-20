package pctEx11_07;

import java.util.Scanner;

public class Ex11_07 {

    public static void main(String[] args) {

        Scanner borabill = new Scanner(System.in);
        int op;
        double deposito = 0;
        System.out.println("------MENU DE OPÇÕES------");
        System.out.println("------1-Ver saldo---------");
        System.out.println("------2-Depósito----------");
        System.out.println("------3-Sair--------------");
        System.out.println("Digite sua opção: ");
        op = borabill.nextInt();

        switch (op) {
            case 1:
                System.out.println("Seu saldo é: R$ 0,00");
                break;
            case 2:
                System.out.println("Digite o valor do depósito: ");
                deposito = borabill.nextDouble();
                System.out.println("Depósito realizado: R$" + deposito);
                break;
            case 3:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        borabill.close();
    }
}