package pctSistemaDeFuncionarios;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, int matricula, double salario, double bonus) {
        super(nome, matricula, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }
    public void exibirInfo() {
        System.out.println("Tipo: Gerente");
        super.exibirInfo();
        System.out.println("Bônus: R$"+ bonus);
    }
}