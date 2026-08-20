package ex14;

import java.util.Scanner;

public class ex14 {
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
		}
	laele.close();
	}
}
