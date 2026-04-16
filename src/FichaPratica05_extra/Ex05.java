package FichaPratica05_extra;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX05__________");
        Scanner input = new Scanner(System.in);

        int[] lista = new int[5];
        int valor;
        boolean teste1 = false;

        System.out.println();
        for (int x = 0; x < lista.length; x++) {
            System.out.print("Insira um número na posição [" + x + "]: ");
            lista[x] = input.nextInt();
        }

        System.out.println("\n_______________\n");

        for (int x = 0; x < lista.length; x++) {
            valor = lista[x];
            for (int y = 0; y < lista.length; y++)
                if (lista[y] == valor && x != y) {
                    teste1 = true;
                    System.out.println(lista[x]);
                }
        }

        if (teste1 == false)
            System.out.println("Não existem números duplicados no array.");
    }
}