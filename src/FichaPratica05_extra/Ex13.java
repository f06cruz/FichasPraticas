package FichaPratica05_extra;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX13__________");
        Scanner input = new Scanner(System.in);

        int [][] matriz =new int[4][3];

        for (int x = 0; x <4; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("Insira um número na posição [" + x+ "][" + y+ "]: ");
                matriz[x][y] = input.nextInt();
            }
        }

        System.out.println("\n_______________\n");

        for (int x = 0; x <4; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println();
        }
    }
}