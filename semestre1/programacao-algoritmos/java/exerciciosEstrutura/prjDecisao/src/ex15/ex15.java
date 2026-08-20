package ex15;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		int temp;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite uma temperatura:");
		temp = laele.nextInt();
		if (temp < 15) {
			System.out.println("Está frio!");
		}
		else if (temp >= 15 && temp <= 25){
			System.out.println("Está agradável!");
		}
		else if (temp >25){
			System.out.println("Está calor!");
		}
	laele.close();
	}
}
