package ex16;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		int num;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite um número:");
		num = laele.nextInt();
		if (num < 0) {
			System.out.println("Seu número é negativo!");
		}
		else if (num == 0){
			System.out.println("Seu número é zero!");
		}
		else if (num >0){
			System.out.println("Seu número é positivo!");
			if (num >50) {
				System.out.println("Seu número é maior que 50!");
			}
			else {
				System.out.println("Seu número não é maior que 50!");
			}

		}
	laele.close();
	}
}
