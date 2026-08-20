package pctWhile02;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        char continuar = 'S';

        System.out.print("Digite a cotação do dólar: R$ ");
        double cotacao = biu.nextDouble();

        while (continuar == 'S') {
            System.out.print("Digite o valor em dólares: US$ ");
            double dolares = biu.nextDouble();
            double reais = dolares * cotacao;

            System.out.printf("Valor convertido: R$ %.2f%n", reais);
            System.out.print("Deseja realizar outra conversão? (S/N): ");
            continuar = biu.next().toUpperCase().charAt(0);
        }

        biu.close();
    }
}
