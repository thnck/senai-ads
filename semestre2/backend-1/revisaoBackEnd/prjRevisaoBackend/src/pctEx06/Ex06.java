package pctEx06;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = biu.nextInt();

        System.out.print("Este é seu número com reajuste de 5%: "+ (num+num*0.05));

        biu.close();
    }
}
