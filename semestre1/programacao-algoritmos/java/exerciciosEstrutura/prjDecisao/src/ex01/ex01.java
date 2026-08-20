package ex01;
import java.util.Scanner;
public class ex01 {
	public static void main(String[] args) {
		int num;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite um número:");
		num = laele.nextInt();
		if (num > 20) {
			System.out.println("Seu número é maior que 20!");
		}
		else {
			System.out.println("Seu número não é maior que 20!");
		}
	laele.close();
	}
}
