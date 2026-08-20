package ex20;

import java.util.Scanner;

public class ex20 {
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
			if(idade >= 65 ){
				System.out.println("e já pode se aposentar");

			}
		}
	laele.close();
	}
}
