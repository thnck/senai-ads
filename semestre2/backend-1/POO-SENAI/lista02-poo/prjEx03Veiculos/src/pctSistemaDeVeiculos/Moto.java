package pctSistemaDeVeiculos;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Tipo: Moto");
        super.exibirInfo();
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }
}