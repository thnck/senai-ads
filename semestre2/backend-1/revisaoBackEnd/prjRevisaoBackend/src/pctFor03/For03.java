package pctFor03;

public class For03 {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Tabuada do " + numero + ":");
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
            }
            System.out.println();
        }
    }
}
