package ex10;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner laele = new Scanner(System.in);
		double n1;
		System.out.println("Digite sua nota:");
		n1 = laele.nextInt();
		if (n1 >= 7) {
		System.out.println("Você está aprovado!");
		}
		else {
			System.out.println("Você está reprovado!");
		}
		laele.close();
	}
}