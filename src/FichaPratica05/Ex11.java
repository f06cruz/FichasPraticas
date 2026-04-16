package FichaPratica05;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX11__________");
        Scanner input = new Scanner(System.in);

        int [][] matriz =new int[3][3];
        int maior=-999, menor=999;

        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("Insira um número na posição [" + (x+1) + "][" + (y+1) +"]: ");
                matriz[x][y] = input.nextInt();
            }
        }

        System.out.println("\n_______________\n");

        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(matriz[x][y]+" ");
                if (matriz[x][y]>maior)
                    maior=matriz[x][y];
                else if (matriz[x][y]<maior)
                    menor=matriz[x][y];
            }
            System.out.println();
        }
        System.out.println("\nO maior número é: "+maior);
        System.out.println("\nO menor número é: "+menor);
    }
}