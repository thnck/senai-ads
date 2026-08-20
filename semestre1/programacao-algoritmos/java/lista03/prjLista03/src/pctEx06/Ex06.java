package pctEx06;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner borabill = new Scanner(System.in);
        double num1, num2, resultado;
        char operacao;
        System.out.println("-----------CALCULADORA---------");
        System.out.println("---Digite o primeiro número: ---");
        num1 = borabill.nextDouble();
        System.out.println("---Digite a operação (+ - * /): ---");
        operacao = borabill.next().charAt(0);
        System.out.println("---Digite o segundo número: ---");
        num2 = borabill.nextDouble();

        resultado = 0; // zerando pra n dar erro no default

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");
        }

        System.out.println("Resultado: " + resultado);

        borabill.close();
    }
}
