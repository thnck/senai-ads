package pctEx01;

import java.util.Scanner;

public class Ex01 {
	public static void main (String[] args){
		Scanner biu = new Scanner(System.in);
		int a, b, c, soma;
		System.out.print("Digite um valor para A: ");
		a = biu.nextInt();
		System.out.print("Digite um valor para B: ");
		b = biu.nextInt();
		System.out.print("Digite um valor para C: ");
		c = biu.nextInt();
		soma = a+b;
		if(soma>=c){
			System.out.println("A soma de A + B é "+soma+" e  NÃO é MENOR que C");
		}else{
			System.out.println("A soma de A + B é "+soma+" e é MENOR que C");
		}
		biu.close();
	}
}
