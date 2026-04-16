package FichaPratica05;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX08__________");
        Scanner input = new Scanner(System.in);

        int [][] matriz =new int[3][3];

        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("Insira um número na posição [" + x+ "][" + y+ "]: ");
                matriz[x][y] = input.nextInt();
            }
        }

        System.out.println("\n_______________\n");

        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println();
        }
    }
}