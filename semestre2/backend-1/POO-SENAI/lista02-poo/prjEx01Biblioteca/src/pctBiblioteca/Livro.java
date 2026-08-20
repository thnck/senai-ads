package pctBiblioteca;

public class Livro {
    public String nome;
    public String autor;
    public int quantidadeDisponivel;

    public Livro(String nome, String autor, int quantidadeDisponivel){
        this.nome = nome;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    public String getNome(){
        return nome;
    }
    public String getAutor(){
        return autor;
    }
    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setQuantidadeDisponivel(int quantidadeDisponivel){
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    public void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Autor: "+autor);
        System.out.println("Quantidade disponível: "+quantidadeDisponivel);
    }
    public void emprestar(int valor){
        if(valor<=quantidadeDisponivel){
            quantidadeDisponivel-=valor;
        }else{
            System.out.println("Você não pode emprestar tantos livros!");
        }

    }
}
