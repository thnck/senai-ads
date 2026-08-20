package pctPrincipal;

public class Ninja {
    {
        private String nome;
        private String aldeia;
        private int chakra;

    public Ninja(String nome, String aldeia, int chakra){
        this.nome = nome;
        this.aldeia = aldeia;
        this.chakra = chakra;
    }
        public String getNome() {
            return nome;
        }
        public String getAldeia() {

        }
        public int getChakra() {
            return chakra;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setAldeia(String aldeia){
            this.aldeia= aldeia;
        }
        public void setChakra(int chakra){
            this.chakra = chakra;
        }
        public void exibirInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Aldeia: " + aldeia);
            System.out.println("Chakra: " + chakra);
        }
        public void atacar(){
            System.out.println(nome+ " usou um ataque!");
        }
    }
}