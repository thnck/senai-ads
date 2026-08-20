package pctEx14_10;

import java.util.Scanner;

public class Ex14_10 {

    public static void main(String[] args) {

        Scanner borabill = new Scanner(System.in);
        double valor, quant, ipi, total, valorcipi, totalfim;

        System.out.println("Digite o valor unitário do produto (em reais): ");
        valor = borabill.nextDouble();
        System.out.println("Digite a quantidade de unidades compradas: ");
        quant = borabill.nextDouble();
        System.out.println("Digite o percentual de IPI (Imposto sobre Produto Industrializado) a ser aplicado: ");
        ipi = borabill.nextDouble();

        total = valor * quant;
        valorcipi = total * (ipi / 100);
        totalfim = total + valorcipi;

        System.out.println("Total sem imposto: R$ " + total);
        System.out.println("Valor do IPI: R$ " + valorcipi);
        System.out.println("Total com imposto: R$ " + totalfim);
        System.out.println("Total com imposto de 15% (IPI): R$ " + (total + total * 15/100));

        borabill.close();
    }
}
