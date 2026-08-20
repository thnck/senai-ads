package ex13;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		int nota;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite sua nota:");
		nota = laele.nextInt();
		if (nota >= 7) {
			System.out.println("Você foi aprovado!");
		}
		else if ((nota >= 5) && (nota <=6)){
			System.out.println("Você está de recuperação!");
		}
		else if ((nota <5 )){
			System.out.println("Você foi reprovado!");
		}
	laele.close();
	}
}
