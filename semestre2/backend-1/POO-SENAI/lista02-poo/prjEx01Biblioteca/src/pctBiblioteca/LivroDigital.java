package pctBiblioteca;

public class LivroDigital extends Livro {
    private double tamanhoArquivoMB;

    public LivroDigital(String nome, String autor, int quantidadeDisponivel, double tamanhoArquivoMB){
        super(nome, autor, quantidadeDisponivel);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }
    public double getTamanhoArquivoMB () {
        return tamanhoArquivoMB;
    }
    public void setTamanhoArquivoMB (double tamanhoArquivoMB){
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }
    @Override
    public void exibirInfo () {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade disponível: " + quantidadeDisponivel);
        System.out.println("Tamanho do arquivo (MB): " + tamanhoArquivoMB);
    }
}