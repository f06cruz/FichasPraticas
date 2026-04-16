package FichaPratica05_extra;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX18__________");
        Scanner input = new Scanner(System.in);


        int linhas, colunas;

        System.out.print("Insira o número de linhas: ");
        linhas = input.nextInt();
        System.out.print("Insira o número se colunas: ");
        colunas = input.nextInt();

        int [][] matriz =new int[linhas][colunas];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[0].length; y++) {
                System.out.print("Insira um número na posição [" + x + "][" + y + "]: ");
                matriz[x][y] = input.nextInt();
            }
        }


        System.out.println("\n_______________\n");

        System.out.println("Matriz");
        for (int x = 0; x <matriz[0].length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println();
        }

    }
}


