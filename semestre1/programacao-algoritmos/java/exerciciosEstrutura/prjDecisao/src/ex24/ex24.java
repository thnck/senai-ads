package ex24;

import java.util.Scanner;

public class ex24 {
	public static void main(String[] args) {
		int num;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite um número e descubra se ele é especial:");
		num = laele.nextInt();
		if (num == 10 || num == 20) {
			System.out.println("Você achou o número especial!");
		}
		else {
			System.out.println("Não foi dessa vez!");
		}
	laele.close();
	}
}

