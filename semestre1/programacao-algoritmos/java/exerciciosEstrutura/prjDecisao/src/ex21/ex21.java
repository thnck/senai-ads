package ex21;

import java.util.Scanner;

public class ex21 {
	public static void main(String[] args) {
		int idade;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		idade = laele.nextInt();
		if (idade >= 18 && idade<70) {
			System.out.println("Você pode tirar carteira de motorista!");
		}
		else {
			System.out.println("Você não pode tirar carteira de motorista!");
		}
	laele.close();
	}
}
