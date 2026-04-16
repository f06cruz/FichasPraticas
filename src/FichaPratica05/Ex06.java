package FichaPratica05;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX06__________\n");
        Scanner input = new Scanner(System.in);

        int [] lista =new int[10];
        boolean cres =true;


        for (int i=0;i< lista.length;i++){
            System.out.print("Insira o valor "+i+": ");
            lista[i] = input.nextInt();
        }

        for (int i=1;i< lista.length;i++){
            if (lista[i]<lista[i-1]) {
                cres = false;
                break;
            }
        }

        System.out.println("\n_______________\n");

        if (cres)
            System.out.println("\nOrdem crescente");
        else System.out.println("\nOrem não crescente");

    }
}