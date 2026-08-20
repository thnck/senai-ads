package pctString;
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		
		Scanner fidubill = new Scanner (System.in);
		
		System.out.print("Digite uma corrente de números: ");
		String corrente = fidubill.nextLine();
		int uns = 0;
		for (char vo : corrente.toCharArray()){
			if (vo == '1' ){
				uns++;
			}
		}
		
		System.out.println("Seu número tem "+uns+" números 1");
		fidubill.close();
	}
}
