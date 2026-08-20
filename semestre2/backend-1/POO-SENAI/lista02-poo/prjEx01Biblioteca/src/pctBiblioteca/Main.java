package pctBiblioteca;

public class Main {
    public static void main(String[] args) {

    Livro livro1 = new Livro("Turma da Mônica", "Maurício de Souza", 10);
    livro1.exibirInfo();

    System.out.println();

    LivroFisico livro2 = new LivroFisico("Hora da Estrela","Clarice Lispector",3,"Setor C");
    livro2.exibirInfo();

    System.out.println();

    LivroDigital livro3 = new LivroDigital("O Alquimista","Paulo Coelho",67,23.4);
    livro3.exibirInfo();
    }
}
