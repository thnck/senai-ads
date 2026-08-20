package pctEx04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner borabill = new Scanner(System.in);
        int prato, sobremesa, bebida, calorias;

        System.out.println("------------MENU------------");
        System.out.println("-----------Pratos-----------");
        System.out.println("1-Vegetariano........180 cal");
        System.out.println("2-Peixe..............230 cal");
        System.out.println("3-Frango.............250 cal");
        System.out.println("4-Carne..............350 cal");
        System.out.println("---------Sobremesas--------");
        System.out.println("1-Abacaxi.............75 cal");
        System.out.println("2-Sorvete diet.......110 cal");
        System.out.println("3-Mouse diet.........170 cal");
        System.out.println("4-Mouse chocolate....200 cal");
        System.out.println("-----------Bebidas----------");
        System.out.println("1-Chá.................20 cal");
        System.out.println("2-Suco de laranja.....70 cal");
        System.out.println("3-Suco de melão......100 cal");
        System.out.println("4-Refrigerante diet...65 cal");

        System.out.println("Digite o número do prato: ");
        prato = borabill.nextInt();
        System.out.println("Digite o número da sobremesa: ");
        sobremesa = borabill.nextInt();
        System.out.println("Digite o número da bebida: ");
        bebida = borabill.nextInt();

        switch (prato) {
            case 1:
                prato = 180;
                break;
            case 2:
                prato = 230;
                break;
            case 3:
                prato = 250;
                break;
            case 4:
                prato = 350;
                break;
            default:
                System.out.println("Este prato não está no menu");
        }

        switch (sobremesa) {
            case 1:
                sobremesa = 75;
                break;
            case 2:
                sobremesa = 110;
                break;
            case 3:
                sobremesa = 170;
                break;
            case 4:
                sobremesa = 200;
                break;
            default:
                System.out.println("Está sobremesa não está no menu");
        }

        switch (bebida) {
            case 1:
                bebida = 20;
                break;
            case 2:
                bebida = 70;
                break;
            case 3:
                bebida = 100;
                break;
            case 4:
                bebida = 65;
                break;
            default:
                System.out.println("Está bebida não está no menu");
        }

        calorias = (prato + sobremesa + bebida);

        System.out.println("Total de calorias: " + calorias + " cal");

        borabill.close();
    }
}
