package pctEx14;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = biu.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = biu.nextDouble();

        double aux = a;
        a = b;
        b = aux;

        System.out.println("Após a troca: A = " + a + " e B = " + b);
        biu.close();
    }
}
