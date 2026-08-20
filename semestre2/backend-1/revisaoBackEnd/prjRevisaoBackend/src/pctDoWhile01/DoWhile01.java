package pctDoWhile01;

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        double soma = 0;
        int quantidade = 0;
        double numero;

        do {
            System.out.print("Digite um número (-1 para encerrar): ");
            numero = biu.nextDouble();
            if (numero != -1) {
                soma += numero;
                quantidade++;
            }
        } while (numero != -1);

        if (quantidade == 0) {
            System.out.println("Nenhum número foi informado.");
        } else {
            System.out.printf("Soma: %.2f%n", soma);
            System.out.printf("Média: %.2f%n", soma / quantidade);
        }
        biu.close();
    }
}
