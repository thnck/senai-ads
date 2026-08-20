package pctEx10;

public class Ex10 {

    public static void main(String[] args) {
    	 int[][] num = {
     		 	{ 1, 2, 5, 1, 5 },
     		    { 3, 2, 4, 2, 3 },
     		    { 4, 1, 2, 3, 7 },
     		    { 5, 5, 2, 4, 9 },
     		    { 1, 2, 4, 5, 100 }
     };
    	 int diagonal = 0;

         for (int i = 0; i < 5; i++) {
             diagonal += num[i][i];
         }

         System.out.println("Soma da diagonal principal: " + diagonal);
     }
 }