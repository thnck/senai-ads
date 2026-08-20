package pctDoWhile02;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        double numero;
        double maior = Double.NEGATIVE_INFINITY;

        do {
            System.out.print("Digite um número (-1 para encerrar): ");
            numero = biu.nextDouble();
            if (numero != -1 && numero > maior) {
                maior = numero;
            }
        } while (numero != -1);

        if (maior == Double.NEGATIVE_INFINITY) {
            System.out.println("Nenhum número foi informado.");
        } else {
            System.out.println("Maior número informado: " + maior);
        }
        biu.close();
    }
}
