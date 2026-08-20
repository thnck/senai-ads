package pctEx10_06;

import java.util.Scanner;

public class Ex10_06 {

    public static void main(String[] args) {

        Scanner borabill = new Scanner(System.in);
        double imc;
        String resposta;

        System.out.println("------CLASSIFICAÇÃO IMC------");
        System.out.println("-------Digite seu IMC:-------");
        imc = borabill.nextDouble();

        if (imc < 18) {
            resposta = "Magro";
        } else if (imc > 18 && imc <= 25) {
            resposta = "Normal";
        } else if (imc > 25) {
            resposta = "Acima do peso";
        } else {
            resposta = "Opção inválida";
        }
        System.out.println(resposta);
        borabill.close();
    }
}