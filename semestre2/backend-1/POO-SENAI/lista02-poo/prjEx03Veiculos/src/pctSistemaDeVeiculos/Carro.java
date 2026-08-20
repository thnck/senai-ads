package pctSistemaDeVeiculos;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Tipo: Carro");
        super.exibirInfo();
        System.out.println("Quantidade de portas: " + quantidadePortas);
    }
}