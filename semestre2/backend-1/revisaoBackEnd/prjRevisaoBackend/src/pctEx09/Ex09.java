package pctEx09;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite o peso em kg: ");
        double peso = biu.nextDouble();
        System.out.print("Digite a altura em metros: ");
        double altura = biu.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso e altura devem ser maiores que zero.");
        } else {
            double imc = peso / (altura * altura);
            String condicao;

            if (imc < 18.5) {
                condicao = "Abaixo do peso";
            } else if (imc < 25) {
                condicao = "Peso ideal (parabéns)";
            } else if (imc < 30) {
                condicao = "Levemente acima do peso";
            } else if (imc < 35) {
                condicao = "Obesidade grau I";
            } else if (imc < 40) {
                condicao = "Obesidade grau II (severa)";
            } else {
                condicao = "Obesidade grau III (mórbida)";
            }

            System.out.printf("IMC: %.2f - %s%n", imc, condicao);
        }
        biu.close();
    }
}
