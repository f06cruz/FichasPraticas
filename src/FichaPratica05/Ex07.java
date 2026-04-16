package FichaPratica05;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX07__________\n");
        Scanner input = new Scanner(System.in);

        int [] lista =new int[10];

        for (int i=0;i< lista.length;i++){
            System.out.print("Insira o valor "+i+": ");
            lista[i] = input.nextInt();
        }

        int par=-1;

        for (int i=0;i< lista.length;i++) {
            if (lista[i] % 2 == 0) {
                if (par%2!=0)
                    par=lista[i];
                if (lista[i] > par)
                    par=lista[i];
            }
        }

        System.out.println("\n_______________\n");

         if (par%2!=0)
            System.out.println("\nNão existe um número par");
         else System.out.println("\nMaior número par: "+ par);

    }
}
