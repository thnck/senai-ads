package ex23;
import java.util.Scanner;
public class ex23 {
	public static void main(String[] args) {
		int idade;
		Scanner laele = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		idade = laele.nextInt();
		if (idade <10 || idade>=60) {
			System.out.println("Você pode usar fila preferencial!");
		}
		else {
			System.out.println("Você não pode usar fila preferencial!");
		}
	laele.close();
	}
}

