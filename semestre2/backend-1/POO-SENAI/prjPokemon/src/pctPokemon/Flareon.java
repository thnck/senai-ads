package pctPokemon;

public class Flareon extends Eevee{
    @Override
    void atacar() {
        System.out.println(nome+" usou Flash Fire!");
    }
    void evoluir(){
        System.out.println(nome+" não consegue evoluir");
    }
}
