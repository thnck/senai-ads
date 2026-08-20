package pctWhile01;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        int numero;

        System.out.println("Digite números. Digite 0 para encerrar.");
        do {
            System.out.print("Digite um número: ");
            numero = biu.nextInt();
            if (numero != 0) {
                System.out.println("Número digitado: " + numero);
            }
        } while (numero != 0);

        System.out.println("Programa encerrado.");
        biu.close();
    }
}
