package pctEx04;

public class Ex04 {
	public static void main(String[] args) {
		
		int[] num = new int [] {1,2,3,4,5,6,7,8};
		int pares = num[0];
		
		for(int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
			pares++;
			
			}
		}
			System.out.println("A quantidade de pares é: "+ (pares-1));
			
	
	}
}