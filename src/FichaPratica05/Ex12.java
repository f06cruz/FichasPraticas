package FichaPratica05;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX12__________");
        Scanner input = new Scanner(System.in);

        int [][] matriz =new int[10][2];
        int [] array1 =new int[10];
        int [] array2 =new int[10];

        for (int x = 0; x <10; x++) {
            System.out.print("Insira um número na posição [" + (x+1) + "] do Array1: ");
            array1[x] = input.nextInt();
            }

        for (int x = 0; x <10; x++) {
            System.out.print("Insira um número na posição [" + (x+1) + "] do Array2: ");
            array2[x] = input.nextInt();
        }

        System.out.println("\n_______________\n");

        for (int x = 0; x <10; x++) {
            for (int y = 0; y < 2; y++) {
                if (y == 0)
                    matriz[x][y] = array1[x];
                else matriz[x][y] = array2[x];
            }
        }

        System.out.println();

        for (int x = 0; x <10; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println();
        }

        System.out.println("\n_______Extra________\n");

        System.out.println("Array1");
        for (int x = 0; x <10; x++) {
                System.out.print(array1[x]+" ");
            }
            System.out.println();

        System.out.println("Array2");
        for (int x = 0; x <10; x++) {
            System.out.print(array2[x]+" ");
            }
            System.out.println();

        System.out.println("Matriz");
        for (int x = 0; x <2; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print(matriz[y][x]+" ");
            }
            System.out.println();
        }

    }
}