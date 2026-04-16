package FichaPratica05_extra;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX14__________");
        Scanner input = new Scanner(System.in);

        int [][] matriz1 =new int[3][3];
        int [][] matriz2 =new int[3][3];
        int [][] matriz3 =new int[3][3];

        System.out.println("\nMatriz 1");
        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("Insira um número na posição [" + x+ "][" + y+ "]: ");
                matriz1[x][y] = input.nextInt();
            }
        }
        System.out.println("\nMatriz 2");
        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("Insira um número na posição [" + x+ "][" + y+ "]: ");
                matriz2[x][y] = input.nextInt();
            }
        }

        System.out.println("\n_______________\n");

        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                matriz3[x][y]=matriz1[x][y]+matriz2[x][y];
                System.out.print(matriz1[x][y]+" + "+matriz2[x][y]+" = "+matriz3[x][y]+" ");
            }
            System.out.println();
        }
    }
}