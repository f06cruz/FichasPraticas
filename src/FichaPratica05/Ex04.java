package FichaPratica05;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX04__________\n");
        Scanner input = new Scanner(System.in);

        int [] lista =new int[10];

        for (int i=0;i<lista.length;i++){
            System.out.print("Insira o valor "+(i+1)+": ");
            lista[i] = input.nextInt();
        }

        int menor =lista[0];

        for (int i=0;i<lista.length;i++){
            if (lista[i]< menor)
                menor = lista[i];
        }

        System.out.println("\n_______________\n");

        System.out.println("\nMenor número: "+ menor);

    }
}