package pctEx07;

public class Ex07 {

    public static void main(String[] args) {
    	int[][] num = {
				{ 19, 25, 100, 99, 32, 45},
				{ 20, 7, 25, 14, 5, 9},
				{ 35, 2, 47, 74, 7, 1}
        };
    	int maiornum = num[0][0];
    	int menornum = num[0][0];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 6; j++) {
				if (num[i][j] > maiornum) {
					maiornum = num[i][j];
			
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 6; j++) {
				if (num[i][j] < menornum) {
					menornum = num[i][j];
			
				}
			}
		}
		System.out.println("O maior número da matriz é o "+ maiornum);
		System.out.println("O menor número da matriz é o "+ menornum);

        
        
    }
}
