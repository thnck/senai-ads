package Agencia;

public class ContaBancaria {
    private String titular;
    private int numconta;
    private double saldo;
    public ContaBancaria(String titular, int numconta, double saldo) {
        this.titular = titular;
        this.numconta = numconta;
        this.saldo= saldo;
    }
    public String getTitular() {
        return titular;
    }
    public int getNumconta() {
        return numconta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void exibirInfo(){
        System.out.println("Titular: "+titular);
        System.out.println("Número da conta: "+numconta);
        System.out.println("Saldo: "+saldo);
    }
    public void depositar(double valor){
        saldo+=valor;
        System.out.println("Depósito realizado: R$"+valor);
    }
    public void sacar(double valor){
        if(valor<=saldo){
            saldo-=valor;
            System.out.println("Saque realizado: R$"+valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

}
