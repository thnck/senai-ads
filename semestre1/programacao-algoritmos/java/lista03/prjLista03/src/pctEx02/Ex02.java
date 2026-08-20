package pctEx02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner borabill = new Scanner(System.in);
		double peso, altura, imc;
		String resposta;

		System.out.println("------CALCULADORA DE IMC------");
		System.out.println("-------Digite seu peso:-------");
		peso = borabill.nextDouble();

		System.out.println("------Digite sua altura:------");
		altura = borabill.nextDouble();
		imc = peso / (altura * altura);
		resposta = (imc < 18.5) ? "Você está abaixo do peso"
				: (imc > 18.5 && imc <= 25) ? "Você está normal"
						: (imc > 25 && imc <= 30) ? "Você está com sobrepeso"
								: (imc > 30 && imc <= 40) ? "Você está com obesidade"
										: (imc > 40) ? "Você está com obesidade mórbida"
												: "Opção inválida";
		System.out.println(resposta);
		borabill.close();
	}
}