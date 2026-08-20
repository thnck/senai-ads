package ex06;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner laele = new Scanner(System.in);
		int num;
		System.out.println("Digite um número");
		num = laele.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("Seu número é par");
			}
		else {
			System.out.println("Seu número é ímpar");
		}
		laele.close();
	}
}