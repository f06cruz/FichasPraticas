package FichaPratica05;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX09__________");
        Scanner input = new Scanner(System.in);

        int [][] matriz =new int[5][5];
        int soma=0;

        for (int x = 0; x <5; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print("Insira um número na posição [" + (x+1) + "][" + (y+1) +"]: ");
                matriz[x][y] = input.nextInt();
            }
        }
        for (int x = 0; x <5; x++) {
            for (int y = 0; y < 5; y++) {
                soma+=matriz[x][y];
            }
        }


        System.out.println("\n_______________\n");

        System.out.println("A soma é de: "+soma);

    }
}