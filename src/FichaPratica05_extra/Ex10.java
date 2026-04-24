package FichaPratica05_extra;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX10__________");
        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[7];
        int valor, cont1=0,cont2=0;
        boolean teste1 = false;

        System.out.println();
        for (int x = 0; x < vetor1.length; x++) {
            System.out.print("Insira um número na posição [" + x + "]: ");
            vetor1[x] = input.nextInt();
        }

        System.out.println("\n_______________");

        valor= vetor1.length;

        for (int x = 0; x < vetor1.length; x++) {
            for (int y = 0; y < vetor1.length; y++) {
                if (vetor1[y] == vetor1[x] && x != y) {
                    teste1 = true;
                    valor--;
                    //System.out.println(vetor1[x]);
                    break;
                }
            }
        }
        if (valor<=0)
            valor=1;
        int[] vetor2 = new int[valor];
        //System.out.println("\nvalor "+valor+"\n");


        //retirar duplicados


        System.out.println();
        if (!teste1)
            System.out.println("Não existem números duplicados no array.");
        else for (int x = 0; x < vetor2.length; x++) {
            System.out.print(vetor2[x]+" ");
        }
    }
}