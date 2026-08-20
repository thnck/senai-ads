package pctString;
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		
		Scanner fidubill = new Scanner (System.in);
		
		String palavra, pinvertida;
		System.out.print("Digite uma palavra: ");
		palavra = fidubill.nextLine();
		
		pinvertida = new StringBuilder(palavra).reverse().toString();
		
		if (palavra.equalsIgnoreCase(pinvertida)) { 
				System.out.println("É um palíndromo");
				} else { 
					System.out.println("Não é um palíndromo");}
			
		fidubill.close();
		}
	} 