package ex09;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		Scanner laele = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite dois números:");
		n1 = laele.nextInt();
		n2 = laele.nextInt();
		if (n1>n2) {
			System.out.println(n1+" é maior que "+n2);
		}
		else if (n2>n1) {
			System.out.println(n2+" é maior que "+n1);
		}
		else if (n1==n2) {
			System.out.println(n1+" é igual a "+n2);
		}
		laele.close();
	}
}