package ex03;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		int num;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite um número:");
		num = laele.nextInt();
		if (num < 100) {
			System.out.println("Seu número é menor que 100!");
		}
		else {
			System.out.println("Seu número é maior que 100!");
		}
	laele.close();
	}
}
