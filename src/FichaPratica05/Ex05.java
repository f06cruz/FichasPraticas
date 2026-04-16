package FichaPratica05;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX05__________\n");
        Scanner input = new Scanner(System.in);

        double [] lista =new double[10];
        double soma=0, media;


        for (int i=0;i< lista.length;i++){
            System.out.print("Insira o valor "+(i+1)+": ");
            lista[i] = input.nextDouble();
        }

        for (int i=0;i<lista.length;i++){
            soma += lista[i];
        }

        media=soma/lista.length;

        System.out.println("\n_______________\n");

        System.out.println("\nMédia: "+ media);

    }
}
