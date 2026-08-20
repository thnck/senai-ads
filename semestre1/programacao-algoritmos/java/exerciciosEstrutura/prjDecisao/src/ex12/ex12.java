package ex12;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		int idade;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		idade = laele.nextInt();
		if (idade <= 12) {
			System.out.println("Você é uma criança!");
		}
		else if ((idade >= 13) && (idade <=17)){
			System.out.println("Você é adolescente!");
		}
		else if ((idade >= 18 )){
			System.out.println("Você é adulto!");
		}
	laele.close();
	}
}
