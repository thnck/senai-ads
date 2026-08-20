package pctEx21;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite o valor da hora-aula: R$ ");
        double valorHora = biu.nextDouble();
        System.out.print("Digite o número de aulas lecionadas no mês: ");
        int numeroAulas = biu.nextInt();
        System.out.print("Digite o percentual de desconto do INSS: ");
        double percentualInss = biu.nextDouble();

        double salarioBruto = valorHora * numeroAulas;
        double descontoInss = salarioBruto * percentualInss / 100;
        double salarioLiquido = salarioBruto - descontoInss;

        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto do INSS: R$ %.2f%n", descontoInss);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
        biu.close();
    }
}
