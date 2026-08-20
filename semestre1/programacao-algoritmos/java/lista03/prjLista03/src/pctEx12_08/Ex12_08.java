package pctEx12_08;

import java.util.Scanner;

public class Ex12_08 {

    public static void main(String[] args) {

        Scanner borabill = new Scanner(System.in);
        int num;

        System.out.println("Digite um número e descubra se ele é múltiplo de 3 e 5:");
        num = borabill.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Múltiplo de 3 e 5");
        } else if (num % 3 == 0) {
            System.out.println("Apenas múltiplo de 3");
        } else if (num % 5 == 0) {
            System.out.println("Apenas múltiplo de 5");
        } else {
            System.out.println("Nenhum");
        }

        borabill.close();

    }
}
