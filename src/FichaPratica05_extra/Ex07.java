package FichaPratica05_extra;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX07__________\n");
        Scanner input = new Scanner(System.in);

        int valor, valor2,cont=0,cont2=0;

        System.out.print("Insira tamanho do array: ");
        valor = input.nextInt();
        System.out.println();

        int[] lista = new int[valor];

        for (int x = 0; x < lista.length; x++) {
            System.out.print("Insira um número no Array [" + x + "]: ");
            lista[x] = input.nextInt();
        }

        System.out.print("\nInsira o valor a remover: ");
        valor2 = input.nextInt();
        System.out.println();

        for (int x = 0; x < lista.length; x++) {
            if (lista[x]!=valor2)
                cont++;
        }

        int[] lista2 = new int[cont];

        for (int x = 0; x < lista.length; x++) {
            if (lista[x]!=valor2){
                lista2[cont2]=lista[x];
                cont2++;
            }

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