package pctEx13_09;

import java.util.Scanner;

public class Ex13_09 {

    public static void main(String[] args) {

        Scanner borabill = new Scanner(System.in);
        int la, lb, lc;
        System.out.println("Descubra o tipo do seu triângulo:");
        System.out.println("Digite o primeiro lado: ");
        la = borabill.nextInt();

        System.out.println("Digite o segundo lado: ");
        lb = borabill.nextInt();

        System.out.println("Digite o terceiro lado: ");
        lc = borabill.nextInt();

        if (la == lb && lb == lc) {
            System.out.println("Equilátero");
        } else if (la == lb || la == lc || lb == lc) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }

        borabill.close();
    }
}
