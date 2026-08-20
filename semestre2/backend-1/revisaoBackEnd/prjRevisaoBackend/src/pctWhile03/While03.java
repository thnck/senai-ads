package pctWhile03;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        double total = 0;
        char continuar = 'S';

        while (continuar == 'S') {
            System.out.print("Digite o preço do produto: R$ ");
            total += biu.nextDouble();
            System.out.print("Deseja adicionar outro produto? (S/N): ");
            continuar = biu.next().toUpperCase().charAt(0);
        }

        System.out.printf("Valor total dos produtos: R$ %.2f%n", total);
        biu.close();
    }
}
