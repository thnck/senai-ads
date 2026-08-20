package pctEx01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner borabill = new Scanner(System.in);
		int num;
		String resp;

		System.out.println("Digite um número");
		num = borabill.nextInt();

		resp = (num % 2 == 0) ? ("É divisível por 2") : ("Não é divisível por 2");
		System.out.println(resp);

		resp = (num % 5 == 0) ? ("É divisível por 5") : ("Não é divisível por 5");
		System.out.println(resp);

		resp = (num % 10 == 0) ? ("É divisível por 10") : ("Não é divisível por 10");
		System.out.println(resp);
		borabill.close();
	}
}
