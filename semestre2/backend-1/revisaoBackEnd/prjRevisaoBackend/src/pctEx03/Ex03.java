package pctEx03;

import java.util.Scanner;

public class Ex03 {
	public static void main (String[] args){
		
		Scanner biu = new Scanner(System.in);
		int a, b, c;
		System.out.print("Digite um valor para A: ");
		a = biu.nextInt();
		System.out.print("Digite um valor para B: ");
		b = biu.nextInt();
		c = a+b;
		if(a==b){
			c = a+b;
			System.out.print("A soma deles é "+ c );
			}else {
				c = a*b;
				System.out.print("O produto deles é "+ c );
			}
		
		biu.close();
	}

}
