package pctEx17;

public class Ex17 {
    public static void main(String[] args) {
        double francisco = 1.10;
        double sara = 1.50;
        int anos = 0;

        while (francisco <= sara) {
            francisco += 0.03;
            sara += 0.02;
            anos++;
        }

        System.out.printf("Francisco será maior que Sara em %d anos (%.2f m contra %.2f m).%n",
                anos, francisco, sara);
    }
}
