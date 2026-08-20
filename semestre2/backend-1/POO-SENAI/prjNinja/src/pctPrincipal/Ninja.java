package pctPrincipal;

public class Ninja {
    private String nome;
    private String aldeia;
    private int chakra;

    public Ninja(String nome, String aldeia, int chakra) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.chakra = chakra;
    }

    public String getNome() {
        return nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public int getChakra() {
        return chakra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void setChakra(int chakra) {
        if (chakra >= 0 && chakra <= 100) {
            this.chakra = chakra;
        }else {
            System.out.println("ERRO, o Chakra deve ser maior que 100");
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Chakra: " + chakra);
    }

    public void atacar() {
        System.out.println(nome + " usou um ataque!");
    }
}