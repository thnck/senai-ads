package pctFor02;

import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = biu.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int segundoNumero = biu.nextInt();

        int vezes = Math.abs(primeiroNumero);
        int resultado = 0;

        for (int i = 0; i < vezes; i++) {
            resultado += segundoNumero;
        }
        if (primeiroNumero < 0) {
            resultado = -resultado;
        }

        System.out.println(primeiroNumero + " x " + segundoNumero + " = " + resultado);
        biu.close();
    }
}
