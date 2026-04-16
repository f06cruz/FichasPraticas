package FichaPratica05;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX03__________");
        Scanner input = new Scanner(System.in);

        int [] lista =new int[10];

        for (int i=0;i< lista.length;i++){
            System.out.print("Insira o valor "+(i+1)+": ");
            lista[i] = input.nextInt();
        }

        int maior =lista[0];

        for (int i=0;i< lista.length;i++){
            if (lista[i]>maior)
                maior = lista[i];
        }

        System.out.println("\n_______________\n");

        System.out.println("\nMaior número: "+ maior);

    }
}