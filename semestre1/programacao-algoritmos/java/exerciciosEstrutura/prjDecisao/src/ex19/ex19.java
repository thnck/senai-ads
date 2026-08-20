package ex19;
import java.util.Scanner;
public class ex19 {
		public static void main(String[] args) {
			int nota;
			Scanner laele = new Scanner(System.in);
			System.out.println("Digite sua nota:");
			nota = laele.nextInt();
			if (nota >= 7) {
				System.out.println("Você foi aprovado!");
				if (nota >= 9) {
					System.out.println("Sua nota foi excelente!");
				}
			}
			else if ((nota <7 )){
				System.out.println("Você foi reprovado!");
			}
		laele.close();
		}
	}
