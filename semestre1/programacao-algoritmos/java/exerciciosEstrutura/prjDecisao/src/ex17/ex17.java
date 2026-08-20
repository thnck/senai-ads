package ex17;

import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		int idade;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		idade = laele.nextInt();
		if (idade < 18) {
			System.out.println("Você é menor de idade!");
		}
		else if (idade >= 18){
			System.out.println("Você é maior de idade");
			if(idade >= 60 ){
				System.out.println("(e já ta ficando velho)");

			}
		}
	laele.close();
	}
}
