package FichaPratica05_extra;
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX17__________");
        Scanner input = new Scanner(System.in);

        int [][] matriz =new int[3][3];
        int maior, menor, maior1, menor1;

        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("Insira um número na posição [" + x+ "][" + y+ "]: ");
                matriz[x][y] = input.nextInt();
            }
        }

        maior=matriz[0][0];
        menor=matriz[0][0];

        System.out.println("\n_______________\n");

        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                if (matriz[x][y]>maior)
                    maior=matriz[x][y];
                if (matriz[x][y]<menor)
                    menor=matriz[x][y];
            }
        }

        maior1=-999;
        menor1=999;
        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                if (matriz[x][y]>maior1&&matriz[x][y]<maior)
                    maior1=matriz[x][y];
                if (matriz[x][y]<menor1&&matriz[x][y]>menor)
                    menor1=matriz[x][y];
            }
        }

        System.out.println("O 2º maior valor é: "+ maior1);
        System.out.println("O 2º menor valor é: "+ menor1);
    }
}