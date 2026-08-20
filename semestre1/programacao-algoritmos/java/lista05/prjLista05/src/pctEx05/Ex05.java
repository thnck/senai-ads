package pctEx05;
import java.util.Scanner;
public class Ex05 {

    public static void main(String[] args) {

        Scanner bill = new Scanner(System.in);

        int[][] matriz = {
            { 89, 8, 9 },
            { 33, 30, 3 },
            { 1, 7, 2 },
            { 67, 11, 21 }
        };

        int num;
        boolean achou = false;

        System.out.print("Digite um valor para procurar: ");
        num = bill.nextInt();

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] == num) {
                    achou = true;
                }
            }
        }

        if (achou) {
            System.out.println("O valor se encontra na matriz");
        } else {
            System.out.println("O valor NÃO se encontra na matriz");
        }

        bill.close();
    }
}