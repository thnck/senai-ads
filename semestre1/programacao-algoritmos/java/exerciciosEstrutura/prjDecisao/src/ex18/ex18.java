package ex18;
import java.util.Scanner;
public class ex18 {
	public static void main(String[] args) {
		Scanner laele = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite dois números:");
		n1 = laele.nextInt();
		n2 = laele.nextInt();
		if (n1>n2) {
			System.out.println(n1+" é o número maior");
		}
		else if (n2>n1) {
			System.out.println(n2+" é o número maior");
		}
		else if (n1==n2) {
			System.out.println("Os números são iguais");
		}
		laele.close();
	}
}