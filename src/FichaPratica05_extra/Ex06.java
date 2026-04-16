package FichaPratica05_extra;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX06__________");
        Scanner input = new Scanner(System.in);

        int valor;

        System.out.println();
        System.out.print("Insira tamanho do array: ");
        valor = input.nextInt();
        System.out.println();

        int[] lista = new int[valor];

        for (int x = 0; x < lista.length; x++){
            System.out.print("Insira um número no Array ["+ x +"]: ");
            lista[x] = input.nextInt();
        }

        System.out.println("\n_______________\n");

        for (int x = 0; x < lista.length; x++){
            System.out.println("Array posição["+ x +"]: "+lista[x]);
        }
    }
}
