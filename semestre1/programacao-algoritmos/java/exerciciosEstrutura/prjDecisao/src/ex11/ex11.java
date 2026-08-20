package ex11;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		int num;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite um número:");
		num = laele.nextInt();
		if (num < 10) {
			System.out.println("Seu número é pequeno!");
		}
		else if ((num > 10) && (num <50)){
			System.out.println("Seu número é médio!");
		}
		else if ((num >50)){
			System.out.println("Seu número é grande!");
		}
	laele.close();
	}
}
