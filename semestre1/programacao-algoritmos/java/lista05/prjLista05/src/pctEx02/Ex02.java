package pctEx02;

public class Ex02 {

	public static void main(String[] args) {
		char[][] mchar = {
				{ 'a', 'b', 'c', 'd', 'e', },
				{ 'f', 'g', 'h', 'i', 'j', },
				{ 'k', 'l', 'n', 'o', 'p', },
				{ 'q', 'r', 's', 't', 'u', }

		};
		int[][] mint = {
				{ 19, 25, 100, 99 },
				{ 20, 7, 25, 14 },
				{ 35, 2, 47, 74 }

		};
		double[][] mdouble = {
				{ 1.9, 2.5, 10.0 },
				{ 1.0, 7.8, 2.5 },
				{ 3.5, 2.2, 4.7 }

		};
		//
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mchar[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mint[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mdouble[i][j] + " ");
			}
			System.out.println();
		}
	}
}