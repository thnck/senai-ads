package pctEx09;

public class Ex09 {

    public static void main(String[] args) {
    	int[][] matriz1 = {
                {1,2,},
                {3,2},
                {4,1},
                {5,5},
                {1,2}
        };
    	int[][] matriz2 = {
                {2,4,},
                {5,3},
                {7,7},
                {4,4},
                {1,9}
    	};
        int[][] matriz3 = new int [5][2];
        
       for(int i = 0; i < 5; i++) {
    	   for(int j = 0; j < 2; j++) {
    		   matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
    	    }
    	  
       }
       System.out.println("Matriz 3: ");
       for(int i = 0; i < 5; i++) {
    	   for(int j = 0; j < 2; j++) {
    		   System.out.print(matriz3[i][j] + " ");
    	    }
    	   System.out.println();
       }
    }
}
