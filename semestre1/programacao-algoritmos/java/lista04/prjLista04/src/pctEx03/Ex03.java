package pctEx03;

public class Ex03 {
	public static void main(String[] args) {
		
		int[] num = new int [] {1,2,3,4,5};
		int maiornum = num[0];
		
		for(int i = 0; i < num.length; i++) {
			if (num[i] > maiornum) {
			maiornum = num[i];
			
			}
		}
		System.out.println("O maior número é o "+ maiornum);
	}
}