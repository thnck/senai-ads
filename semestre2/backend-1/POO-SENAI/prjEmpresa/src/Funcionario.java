public class Funcionario {
    String nome;
    int idade;
    String sexo;
    int salario;

    void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
    }
    void exibirSalario(){
        System.out.println("Salario: "+salario);
    }
}
