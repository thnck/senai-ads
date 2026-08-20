package pctEx02;
import java.util.Scanner;
public class Ex02 { 

	public static void main(String[] args) {
		Scanner borabill = new Scanner(System.in);
		
		//variaveis
		char opcao;
		double preco = 0;
		double npreco = 0;
		int quantidade;
		
		//menu
		System.out.println("---------------------------MENU---------------------------");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!PROMOÇÃO!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("NA COMPRA DE TRÊS ITENS OU MAIS VOCÊ GANHA 10% DE DESCONTO");
		System.out.println("A- Hambúrguer.....................................R$ 15,00");	
		System.out.println("B- Pizza..........................................R$ 20,00");
		System.out.println("C- Refrigerante....................................R$ 5,00");
		System.out.println("------------------ESCOLHA UMA DAS OPÇÕES------------------");
		
		//opcoes
		opcao = borabill.next().charAt(0);
		char minopcao = Character.toLowerCase(opcao);
		
		//quantidade
		System.out.println("--------------------DIGITE A QUANTIDADE-------------------");
		quantidade = borabill.nextInt();
		
		//possibilidades
		switch (minopcao) {
		case 'a': 
			preco =  15 * quantidade;
			break;
		case 'b': 
			preco =  20 * quantidade;
			break;
		case 'c': 
			preco =  5 * quantidade;
			break;
		default:
			System.out.println("Opção inválida");
			
		//promocao
		} if (quantidade>=3) {
			npreco = preco - (preco * 10/100);
		} else {
			npreco = preco;
		}
		
		//total
		System.out.println("TOTAL DA COMPRA: R$" + npreco );
		borabill.close();
	}
}