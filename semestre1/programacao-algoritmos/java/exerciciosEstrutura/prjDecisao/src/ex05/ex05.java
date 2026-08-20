package ex05;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		int temp;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite a temperatura de agora:");
		temp = laele.nextInt();
		if (temp > 30) {
			System.out.println("Tá calor hein!");
		}
		else {
			System.out.println("Não tá tão quente!");
		}
	laele.close();
	}
}
