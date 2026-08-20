package pctBiblioteca;

public class LivroFisico extends Livro {
    private String localizacaoPrateleira;

    public LivroFisico(String nome, String autor, int quantidadeDisponivel, String localizacaoPrateleira){
        super(nome, autor, quantidadeDisponivel);
        this.localizacaoPrateleira = localizacaoPrateleira;
    }
    public String getLocalizacaoPrateleira () {
        return localizacaoPrateleira;
    }
    public void setLocalizacaoPrateleira (String localizacaoPrateleira){
        this.localizacaoPrateleira = localizacaoPrateleira;
    }
    @Override
    public void exibirInfo () {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade disponível: " + quantidadeDisponivel);
        System.out.println("Localizacao na prateleira: " + localizacaoPrateleira);
    }
}