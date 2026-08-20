package pctEx22;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = biu.nextDouble();
        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidadeMedia = biu.nextDouble();

        double distancia = tempo * velocidadeMedia;
        double litrosUsados = distancia / 12;

        System.out.printf("Tempo gasto: %.2f h%n", tempo);
        System.out.printf("Velocidade média: %.2f km/h%n", velocidadeMedia);
        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Combustível utilizado: %.2f litros%n", litrosUsados);
        biu.close();
    }
}
