package Agencia;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        System.out.print("Qual seu nome? ");
        String a = input.nextLine();
        System.out.print("Qual o número da sua conta? ");
        int b = input.nextInt();
        System.out.print("Quanto você tem na sua conta? ");
        double c = input.nextDouble();


        ContaBancaria conta = new ContaBancaria(a, b, c);

        do {
            System.out.println();
            conta.exibirInfo();
            System.out.println("\nServiços: 1- Depositar, 2-Sacar, 3-Sair");
            opcao = input.nextInt();

            double valor = 0;

            switch (opcao) {
                case 1:
                    System.out.print("Quanto você deseja depositar? ");
                    valor = input.nextDouble();
                    conta.depositar(valor);
                    break;

                case 2:
                    System.out.print("Quanto você deseja sacar? ");
                    valor = input.nextDouble();
                    conta.sacar(valor);
                    break;

                case 3:
                    System.out.print("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");

            }
        }while (opcao != 3) ;
    input.close();
    }
}
