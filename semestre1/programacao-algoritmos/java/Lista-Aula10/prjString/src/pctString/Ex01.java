package pctString;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner fidubill = new Scanner (System.in);
		
		System.out.print("Digite uma corrente de caracteres: ");
		String palavra = fidubill.nextLine();
		
		System.out.println("\nSua corrente possui "+palavra.length() + " letras");
		System.out.println("Sua corrente com letras maiúsculas fica: " + palavra.toUpperCase());
		
		int vogais = 0;
		for (char vo : palavra.toLowerCase().toCharArray()){
			if (vo == 'a' || vo == 'e' || vo == 'i' || vo == 'o' || vo == 'u' ){
				vogais++;
			}
		}
		System.out.println(vogais);
		fidubill.close();
	}
}
