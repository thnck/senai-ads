package pctEx03;

public class Ex03 {

    public static void main(String[] args) {
        int[][] num = {
                { 1, 2, 2 },
                { 3, 2, 3 },
                { 4, 1, 1 }
        };
        for (int i = 0; i < 3; i++) {
            int soma = 0;

            for (int j = 0; j < 3; j++) {
                soma += num[i][j];
            }
            System.out.println("Soma da linha " + (i + 1) + ": " + soma);
        }
    }
}
