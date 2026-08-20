package pctSistemaDeFuncionarios;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Fulano", 7676, 5000.00, 1500.00);
        gerente.exibirInfo();

        System.out.println();

        Vendedor vendedor = new Vendedor("Ciclano", 6767, 1700.00, 400.00);
        vendedor.exibirinfo();

    }
}