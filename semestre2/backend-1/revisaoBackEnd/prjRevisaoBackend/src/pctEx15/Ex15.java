package pctEx15;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        double a = biu.nextDouble();
        System.out.print("Digite o segundo lado: ");
        double b = biu.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        double c = biu.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Os valores não formam um triângulo válido.");
        } else if (a == b && b == c) {
            System.out.println("Triângulo equilátero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo isósceles.");
        } else {
            System.out.println("Triângulo escaleno.");
        }
        biu.close();
    }
}
