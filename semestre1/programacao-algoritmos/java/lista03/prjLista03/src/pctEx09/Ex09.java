package pctEx09;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner borabill = new Scanner(System.in);
        int num;
        String intervalo;

        System.out.println("Digite um número e descubra se ele está entre o intervalo: ");
        num = borabill.nextInt();
        intervalo = (num >= 10 && num <= 50) ? "Dentro do intervalo" : "Fora do intervalo";
        System.out.println(intervalo);
        borabill.close();
    }
}
