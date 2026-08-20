package pctEx13;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner biu = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = biu.nextLine();
        System.out.print("Digite a idade: ");
        int idade = biu.nextInt();

        System.out.println(nome + " é " + (idade >= 18 ? "maior" : "menor") + " de idade.");
        biu.close();
    }
}
