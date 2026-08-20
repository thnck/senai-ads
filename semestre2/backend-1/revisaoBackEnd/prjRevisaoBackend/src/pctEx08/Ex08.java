package pctEx08;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        int[] valores = new int[3];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor inteiro: ");
            valores[i] = biu.nextInt();
        }

        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] < valores[j]) {
                    int aux = valores[i];
                    valores[i] = valores[j];
                    valores[j] = aux;
                }
            }
        }

        System.out.println("Valores em ordem decrescente: "
                + valores[0] + ", " + valores[1] + ", " + valores[2]);
        biu.close();
    }
}
