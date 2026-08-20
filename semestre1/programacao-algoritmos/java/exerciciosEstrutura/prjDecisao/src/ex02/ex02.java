package ex02;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		int num;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite um número:");
		num = laele.nextInt();
		if (num == 0) {
			System.out.println("Seu número é igual a 0!");
		}
		else {
			System.out.println("Seu número não é igual a 0!");
		}
	laele.close();
	}
}