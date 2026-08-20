package pctEx12;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite o valor do produto: R$ ");
        double valor = biu.nextDouble();
        System.out.println("1 - Dinheiro/Pix (15% de desconto)");
        System.out.println("2 - Cartão à vista (10% de desconto)");
        System.out.println("3 - Cartão em 2 vezes (sem juros)");
        System.out.println("4 - Cartão em 3 ou mais vezes (10% de juros)");
        System.out.print("Digite o código da forma de pagamento: ");
        int codigo = biu.nextInt();

        double valorFinal;
        switch (codigo) {
            case 1 -> valorFinal = valor * 0.85;
            case 2 -> valorFinal = valor * 0.90;
            case 3 -> valorFinal = valor;
            case 4 -> valorFinal = valor * 1.10;
            default -> {
                System.out.println("Código de pagamento inválido.");
                biu.close();
                return;
            }
        }
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);
        biu.close();
    }
}
