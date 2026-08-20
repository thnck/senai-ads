package pctEx02;

import java.util.Scanner;

public class Ex02 {
	public static void main (String[] args){
		Scanner biu = new Scanner(System.in);
		int num;
		System.out.print("Digite um número qualquer: ");
		num = biu.nextInt();
		System.out.println((num % 2 == 0) ? "Seu número é par" : "Seu número é ímpar");
		System.out.println((num >= 0) ? "Seu número é positivo" : "Seu número é negativo");
		biu.close();
	}
}
