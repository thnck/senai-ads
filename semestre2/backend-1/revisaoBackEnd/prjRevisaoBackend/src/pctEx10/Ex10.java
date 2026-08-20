package pctEx10;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += biu.nextDouble();
        }

        System.out.printf("Média das notas: %.2f%n", soma / 3);
        biu.close();
    }
}
