package ex25;

import java.util.Scanner;

public class ex25 {
	public static void main(String[] args) {
		int num;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite um número:");
		num = laele.nextInt();
		if (num != 0) {
			System.out.println("Número diferente de zero!");
		}
		else {
			System.out.println("Número igual a zero!");
		}
	laele.close();
	}
}

