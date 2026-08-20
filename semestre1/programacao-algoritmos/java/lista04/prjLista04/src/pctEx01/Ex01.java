package pctEx01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner biu = new Scanner (System.in);
		int[] num = new int [5];
		for(int i = 0; i < num.length; i++) {
			System.out.println("Digite um número inteiro");
			num[i] = biu.nextInt();
			}
		for(int i = 0; i < num.length; i++) {
			System.out.println("Vetor Nº"+i+" = "+ num[i]);	
			}
		biu.close();
	}
	
}