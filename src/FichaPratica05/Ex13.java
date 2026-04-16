package FichaPratica05;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX13__________");
        Scanner input = new Scanner(System.in);

        int [][] matriz =new int[4][4];
        int soma=0;

        for (int x = 0; x <4; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.print("Insira um número na posição [" + (x+1) + "][" + (y+1) +"]: ");
                matriz[x][y] = input.nextInt();
            }
        }

        System.out.println("\n_______________\n");

        for (int x = 0; x <4; x++) {
            for (int y = 0; y < 4; y++) {
                if (x==y)
                    soma+=matriz[x][y];
            }
        }
        System.out.println("Soma da diagonal principal: "+ soma);
    }
}