package pctEx01;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		Scanner borabill = new Scanner(System.in);
		
		//variaveis
		char opcao;
		double preco = 0;
		int quantidade;
		
		//menu
		System.out.println("---------------------------MENU---------------------------");
		System.out.println("A- Café............................................R$ 4,00");	
		System.out.println("B- Suco............................................R$ 6,00");
		System.out.println("C- Sanduíche......................................R$ 10,00");
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
			preco =  4 * quantidade;
			break;
		case 'b': 
			preco =  6 * quantidade;
			break;
		case 'c': 
			preco =  10 * quantidade;
			break;
		default:
			System.out.println("Opção inválida");
		}
		
		//total
		System.out.println("TOTAL DA COMPRA: R$" + preco );
		borabill.close();
	}
}