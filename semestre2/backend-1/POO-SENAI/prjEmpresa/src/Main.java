public class Main {
    public static void main(String[] args) {
    FuncionarioHorista fh = new FuncionarioHorista();
    FuncionarioMensalista fm = new FuncionarioMensalista();

    fh.nome = "Ronaldo";
    fh.idade = 18;
    fh.sexo = "Masculino";
    fh.salario = 1500;
    fh.exibirInfo();
    fh.exibirSalario();

    System.out.println();

    fm.nome = "Rosana";
    fm.idade = 18;
    fm.sexo = "Feminino";
    fm.salario = 1900;
    fm.exibirInfo();
    fm.exibirSalario();


    }
}