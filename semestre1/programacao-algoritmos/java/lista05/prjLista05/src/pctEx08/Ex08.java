package pctEx08;

public class Ex08 {

    public static void main(String[] args) {
        int[][] original = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] invertida = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                invertida[j][i] = original[i][j];
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMatriz invertida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(invertida[i][j] + " ");
            }
            System.out.println();
        }
    }
}
