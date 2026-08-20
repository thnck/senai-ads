package pctEx05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner borabill = new Scanner(System.in);
        int dia;
        String resp;
        System.out.println("Informe o dia da semana numericamente: (1-7)");
        dia = borabill.nextInt();
        switch (dia) {
            case 1:
            case 7:
                resp = "Fim de semana";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                resp = "Dia útil";
                break;
            default:
                resp = "Dia inválido";
        }
        System.out.println(resp);

        borabill.close();
    }
}
