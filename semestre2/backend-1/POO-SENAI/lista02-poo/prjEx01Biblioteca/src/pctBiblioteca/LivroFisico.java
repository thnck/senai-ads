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
        super.exibirInfo();
        System.out.println("Localizacao na prateleira: " + localizacaoPrateleira);
    }
}