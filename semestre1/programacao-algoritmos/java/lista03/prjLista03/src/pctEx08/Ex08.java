package pctEx08;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner borabill = new Scanner(System.in);
        String usuario, senha, acesso;

        System.out.println("Digite o usuário: ");
        usuario = borabill.nextLine();
        System.out.println("Digite a senha: ");
        senha = borabill.nextLine();

        acesso = (usuario.equals("admin") && senha.equals("123")) ? "Acesso permitido" : "Acesso negado";
        System.out.println(acesso);
        borabill.close();
    }
}
