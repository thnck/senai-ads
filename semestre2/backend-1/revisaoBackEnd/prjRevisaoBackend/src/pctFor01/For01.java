package pctFor01;

import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite a quantidade de funcionários: ");
        int quantidade = biu.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade de funcionários deve ser maior que zero.");
        } else {
            double soma = 0;
            double maior = Double.NEGATIVE_INFINITY;
            double menor = Double.POSITIVE_INFINITY;

            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Digite o salário do funcionário " + i + ": R$ ");
                double salario = biu.nextDouble();
                soma += salario;

                if (salario > maior) {
                    maior = salario;
                }
                if (salario < menor) {
                    menor = salario;
                }
            }

            System.out.printf("Média salarial: R$ %.2f%n", soma / quantidade);
            System.out.printf("Maior salário: R$ %.2f%n", maior);
            System.out.printf("Menor salário: R$ %.2f%n", menor);
        }
        biu.close();
    }
}
