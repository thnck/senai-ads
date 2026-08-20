package pctEx01;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args){
		int i, lin, col;
		
		Scanner biu= new Scanner(System.in);
		System.out.println("Bem vindo ao registro de clientes!");
		System.out.println("Quantos usuários você deseja registrar?");
		lin = biu.nextInt();
		biu.nextLine();
		col = 5;
		String[][] info =  new String[lin][col];
		
		
		for(i = 0; i<lin ; i++) {
			System.out.println("Faça o registro do cliente "+ (i+1) +":");
			System.out.print("Digite o nome: ");
			info[i][0] = biu.nextLine();
			System.out.print("Digite o endereço: ");
			info[i][1] = biu.nextLine();
			System.out.print("Digite o bairro: ");
			info[i][2] = biu.nextLine();
			System.out.print("Digite o telefone: ");
			info[i][3] = biu.nextLine();
			System.out.print("Digite o CPF: ");
			info[i][4] = biu.nextLine();
			System.out.println();
		}
		for(i=0; i<lin; i++) {
			System.out.println("Registro do cliente "+ (i+1) +":");
			System.out.println("Nome: "+ info[i][0]);
			System.out.println("Endereço: "+ info[i][1]);
			System.out.println("Bairro: "+ info[i][2]);
			System.out.println("Telefone: "+ info[i][3]);
			System.out.println("CPF: "+ info[i][4]);
			System.out.println("");
		}
		biu.close();
		}
}