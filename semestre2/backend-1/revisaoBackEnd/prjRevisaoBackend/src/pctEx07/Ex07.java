package pctEx07;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite um valor booleano: ");
        boolean v1 = biu.nextBoolean();
        System.out.print("Digite outro valor booleano: ");
        boolean v2 = biu.nextBoolean();
        if (v1 == v2){
            System.out.println("Os valores booleanos são iguais");
        }else{
            System.out.println("Os valores booleanos são diferentes");
        }
        biu.close();
    }
}