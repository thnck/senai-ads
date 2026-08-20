package pctEx16;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = biu.nextDouble();
        double celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%.2f °F correspondem a %.2f °C.%n", fahrenheit, celsius);
        biu.close();
    }
}
