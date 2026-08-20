package ex08;

import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		int num;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite um número:");
		num = laele.nextInt();
		if (num > 0) {
			System.out.println("Seu número é positivo!");
		}
		else {
			System.out.println("Seu número é negativo!");
		}
	laele.close();
	}
}
