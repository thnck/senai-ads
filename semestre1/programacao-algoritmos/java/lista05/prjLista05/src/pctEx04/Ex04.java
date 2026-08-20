package pctEx04;

public class Ex04 {

    public static void main(String[] args) {
        int[][] num = {
        		 	{ 1, 2, 3, 4, 5 },
        		    { 6, 7, 8, 9, 10 },
        		    { 11, 12, 13, 14, 15 },
        		    { 16, 17, 18, 19, 20 },
        		    { 21, 22, 23, 24, 25 }
        };

        int impar, somai, somaj, i, j;
        impar = 0;
        for (i = 0; i < 5; i++) {
        	
            for (j = 0; j < 5; j++) {
                if(num[i][j] % 2 != 0 ) {
                	impar += num[i][j];
                
                }
            }
        }
        System.out.println("Soma dos ímpares: "+ impar);
        System.out.println();
        
        for (j = 0; j < 5; j++) {
            somaj = 0;
            for (i = 0; i < 5; i++) {
                somaj += num[i][j];
            }
            System.out.println("Soma da coluna " + (j + 1) + ": " + somaj);
        }
        System.out.println();
        for (i = 0; i < 5; i++) {
            somai = 0;
            for (j = 0; j < 5; j++) {
                somai += num[i][j];
            }
            System.out.println("Soma da linha " + (i + 1) + ": " + somai);
        }
    }
}