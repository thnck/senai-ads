package pctString;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		
		Scanner fidubill = new Scanner (System.in);
		String palavra, pinvertida;
		
		System.out.print("Digite uma palavra: ");
		palavra = fidubill.nextLine();
		pinvertida = new StringBuilder(palavra).reverse().toString();
		System.out.println("Sua palavra invertida é: "+pinvertida);
		
		fidubill.close();
		}
	} 