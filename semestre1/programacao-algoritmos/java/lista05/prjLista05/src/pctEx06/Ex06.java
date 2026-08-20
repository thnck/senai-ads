package pctEx06;

public class Ex06 {

    public static void main(String[] args) {
        int[][] num = {
        		{ 1, 2, 3, 4, 5 },
    		    { 6, 7, 8, 9, 10 }
        };

        double soma = 0;
        ;

        for (int i = 0; i < 2; i++) {
        	for (int j = 0; j < 5; j++)
            soma += num[i][j];
        }
        double media = soma/10;
        System.out.println("Média da matriz: " + media);
    }
}
