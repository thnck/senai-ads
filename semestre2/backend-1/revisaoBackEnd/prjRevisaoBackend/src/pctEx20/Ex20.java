package pctEx20;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite o valor inteiro A: ");
        int a = biu.nextInt();
        System.out.print("Digite o valor inteiro B: ");
        int b = biu.nextInt();

        if (b == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else {
            System.out.println("Quociente: " + (a / b));
            System.out.println("Resto: " + (a % b));
        }
        biu.close();
    }
}
