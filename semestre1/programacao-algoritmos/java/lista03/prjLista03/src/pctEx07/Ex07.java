package pctEx07;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner borabill = new Scanner(System.in);
        double compra, des, fina;

        System.out.println("Digite o valor da sua compra: ");
        compra = borabill.nextDouble();
        des = (compra >= 100) ? 0.10 : 0;

        fina = compra - compra * des;
        System.out.println("Valor da compra com desconto de 10%: R$" + fina + "0");

        borabill.close();
    }
}