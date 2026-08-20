package pctEx18;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = biu.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s x %d = %s%n", numero, i, numero * i);
        }
        biu.close();
    }
}
