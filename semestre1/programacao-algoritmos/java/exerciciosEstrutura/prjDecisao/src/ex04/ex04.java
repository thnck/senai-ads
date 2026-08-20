package ex04;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		int idade;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		idade = laele.nextInt();
		if (idade >= 60) {
			System.out.println("Tá velho(a) hein!");
		}
		else {
			System.out.println("Tá novo(a) ainda!");
		}
	laele.close();
	}
}
