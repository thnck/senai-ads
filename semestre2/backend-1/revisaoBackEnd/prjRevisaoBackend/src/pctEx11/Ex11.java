package pctEx11;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = biu.nextLine();
        double soma = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += biu.nextDouble();
        }

        double media = soma / 4;
        String situacao = media >= 7 ? "aprovado" : "reprovado";
        System.out.printf("Aluno: %s%nMédia: %.2f%nSituação: %s%n", nome, media, situacao);
        biu.close();
    }
}
