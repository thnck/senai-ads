package pctPokemon;

public class Main {

        public static void main(String[] args) {
            //instanciar ou criar um objeto
            Pokemon pikachu = new Pokemon();

            pikachu.nome = "Pikachu";
            pikachu.tipo = "Eletrico";
            pikachu.nivel = 10;
            pikachu.hp= 100;
            pikachu.exibirInfo();

            System.out.println();

            Eevee eevee = new Eevee();
            eevee.nome = "Eevee";
            eevee.tipo = "Normal";
            eevee.nivel = 5;
            eevee.hp= 80;
            eevee.exibirInfo();
            eevee.evoluir();

            System.out.println();

            Flareon flareon = new Flareon();
            flareon.nome = "Flareon";
            flareon.tipo = "Normal";
            flareon.nivel = 20;
            flareon.hp= 160;
            flareon.exibirInfo();
        }

}
