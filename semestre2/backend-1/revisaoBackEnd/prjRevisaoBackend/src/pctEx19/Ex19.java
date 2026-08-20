package pctEx19;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int numero = biu.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        biu.close();
    }
}
