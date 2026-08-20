package pctEx03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner borabill = new Scanner(System.in);
        double saldo, perce, credi;

        System.out.println("------Digite seu saldo médio do último ano:------");
        saldo = borabill.nextDouble();
        perce = (saldo <= 500) ? 0
                : (saldo <= 1000) ? 30
                        : (saldo <= 3000) ? 40
                                : 50;

        credi = saldo * perce / 100;
        System.out.println("Saldo médio: R$" + saldo + "0");
        System.out.println("Percentual: " + perce + "%");
        System.out.println("Seu crédito é de: R$" + credi + "0");

        borabill.close();
    }
}