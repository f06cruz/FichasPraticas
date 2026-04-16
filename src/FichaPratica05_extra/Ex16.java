package FichaPratica05_extra;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX16__________");
        Scanner input = new Scanner(System.in);

        int [][] matriz =new int[3][3];
        int maior, menor;

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
        System.out.println("O maior valor é: "+ maior);
        System.out.println("O menor valor é: "+ menor);
    }
}