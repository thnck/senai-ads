package pctExAvan02;

import java.util.Random;
import java.util.Scanner;

public class ExAvan02 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt(100);
        Scanner biu = new Scanner(System.in);
        int tentativa;

        do {
            System.out.print("Digite um número entre 0 e 99: ");
            tentativa = biu.nextInt();

            if (tentativa < x) {
                System.out.println("MAIOR");
            } else if (tentativa > x) {
                System.out.println("MENOR");
            }
        } while (tentativa != x);

        System.out.println("Você acertou!");
        biu.close();
    }
}
