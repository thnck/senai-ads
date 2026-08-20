package pctEx04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner biu = new Scanner(System.in);
		int num, ant, suc;
		System.out.print("Digite um número qualquer: ");
		num = biu.nextInt();
		ant = num-1;
		suc = num+1;
		System.out.println("O antecessor do seu número é "+ant+" e o sucessor é "+suc);
		biu.close();
	}

}
