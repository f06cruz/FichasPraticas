package FichaPratica05;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX12__________");
        Scanner input = new Scanner(System.in);

        int [][] matriz =new int[10][2];
        int [] array1 =new int[10];
        int [] array2 =new int[10];

        for (int x = 0; x <array1.length; x++) {
            System.out.print("Insira um número na posição [" +x+ "] do Array1: ");
            array1[x] = input.nextInt();
            }

        for (int x = 0; x <array2.length; x++) {
            System.out.print("Insira um número na posição [" +x+ "] do Array2: ");
            array2[x] = input.nextInt();
        }

        System.out.println("\n_______________\n");

        for (int x = 0; x < matriz.length; x++) {
                matriz[x][0] = array1[x];
                matriz[x][1] = array2[x];
            }

        System.out.println();

        for (int x = 0; x <matriz.length; x++) {
            for (int y = 0; y < matriz[0].length; y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println();
        }

        System.out.println("\n_______Extra________\n");

        System.out.println("Array1");
        for (int x = 0; x <array1.length; x++) {
                System.out.print(array1[x]+" ");
            }
            System.out.println();

        System.out.println("Array2");
        for (int x = 0; x <array2.length; x++) {
            System.out.print(array2[x]+" ");
            }
            System.out.println();

        System.out.println("Matriz");
        for (int x = 0; x <matriz[0].length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                System.out.print(matriz[y][x]+" ");
            }
            System.out.println();
        }

    }
}