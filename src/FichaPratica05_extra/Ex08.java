package FichaPratica05_extra;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX08__________\n");
        Scanner input = new Scanner(System.in);

        int valor, valor2,lugar,cont=0;

        System.out.print("Insira tamanho do array: ");
        valor = input.nextInt();
        System.out.println();

        int[] lista = new int[valor];

        for (int x = 0; x < lista.length; x++) {
            System.out.print("Insira um número no Array [" + x + "]: ");
            lista[x] = input.nextInt();
        }

        System.out.print("\nNovo valor: ");
        valor2 = input.nextInt();
        System.out.print("Índice do Novo valor: ");
        lugar = input.nextInt();
        System.out.println();

        int[] lista2 = new int[valor+1];

        for (int x = 0; x < lista2.length; x++) {
            if (x!=lugar) {
                lista2[x] = lista[x];
                cont++;
            } else {
                lista2[x]=valor2;
                cont++;
                break;
            }
        }

        for (int x = cont; x < lista2.length; x++) {
            lista2[x] = lista[x-1];
        }

        System.out.println("\n_______________\n");

        for (int x = 0; x < lista.length; x++) {
            System.out.print("Array posição[" + x + "]: " + lista[x]+"  ");
        }
        System.out.println();
        for (int x = 0; x < lista2.length; x++) {
            System.out.print("Array posição[" + x + "]: " + lista2[x]+"  ");
        }
    }
}