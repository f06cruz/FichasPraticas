package FichaPratica05_extra;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX15__________");
        Scanner input = new Scanner(System.in);

        double [][] matriz =new double[3][2];
        double media=0;

        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print("Insira um número na posição [" + x+ "][" + y+ "]: ");
                matriz[x][y] = input.nextDouble();
            }
        }

        System.out.println("\n_______________\n");

        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 2; y++) {
                media+=matriz[x][y];
            }
        }
        media/=6;
        System.out.println("A média é : "+media);
    }
}