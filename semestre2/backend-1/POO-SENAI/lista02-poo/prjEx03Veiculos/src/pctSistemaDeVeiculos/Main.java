package pctSistemaDeVeiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Vectra", 1999,4);
        carro.exibirInfo();

        System.out.println();

        Moto moto = new Moto("Honda", "XRE300", 2010, 300);
        moto.exibirInfo();
    }
}