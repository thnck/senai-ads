package pctEx05;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
	Scanner biu = new Scanner(System.in);
	double salario;
	System.out.print("Digite seu sálario em R$: ");
	salario = biu.nextDouble();
	System.out.println("Você ganha um total de "+(salario/1621)+" salarios mínimos");
	biu.close();
	}
}
