package ex22;

import java.util.Scanner;

public class ex22 {
	public static void main(String[] args) {
		int nota, fre;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite sua nota:");
		nota = laele.nextInt();
		System.out.println("Digite sua frequência:");
		fre = laele.nextInt();

		if (nota >= 6 && fre>=75) {
			System.out.println("Você foi aprovado!");
		}
		else {
			System.out.println("Você foi reprovado!");
		}
	laele.close();
	}
}
