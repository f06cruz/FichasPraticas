package FichaPratica05;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX10__________");
        Scanner input = new Scanner(System.in);

        int [][] matriz =new int[3][5];
        int valor,cont=0;

        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print("Insira um número na posição [" + (x+1) + "][" + (y+1) +"]: ");
                matriz[x][y] = input.nextInt();
            }
        }
        System.out.print("\nInsira um número para pesquisar: ");
        valor= input.nextInt();

        for (int x = 0; x <3; x++) {
            for (int y = 0; y < 5; y++) {
                if (matriz[x][y]==valor)
                    cont++;
            }
        }


        System.out.println("\n_______________\n");

        System.out.println("Há "+cont+" posições na matriz com o número "+valor+".");

    }
}