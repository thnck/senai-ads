package pctPokemon;

public class Pokemon {
    //atributos do pokemon
    String nome;
    String tipo;
    int nivel;
    int hp;

    //metodos
    void atacar() {
        System.out.println(nome+" está atacando!");
    }

    void evoluir() {
        System.out.println(nome+" está evoluindo!");
    }

    //metodo de exibicao
    void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Tipo: "+tipo);
        System.out.println("Nivel: "+nivel);
        System.out.println("HP: "+hp);
        atacar();
        evoluir();
    }
}
