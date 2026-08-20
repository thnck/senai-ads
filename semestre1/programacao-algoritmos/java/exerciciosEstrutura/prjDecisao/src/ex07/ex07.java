package ex07;

import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		int idade;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		idade = laele.nextInt();
		if (idade >= 18) {
			System.out.println("Já é maior de idade!");
		}
		else {
			System.out.println("Ainda é menor de idade!");
		}
	laele.close();
	}
}
