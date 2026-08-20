package pctSistemaDeFuncionarios;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, int matricula, double salario, double comissao) {
        super(nome, matricula, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + comissao;
    }
    public void exibirinfo() {
        System.out.println("Tipo: Vendedor");
        super.exibirInfo();
        System.out.println("Comissão: R$"+comissao);
    }
}