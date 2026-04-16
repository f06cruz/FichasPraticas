package FichaPratica05_extra;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX04__________");
        Scanner input = new Scanner(System.in);

        int [] lista =new int[10];
        int valor;
        boolean teste =false;

        for (int x = 0; x < lista.length; x++) {
            System.out.print("Insira um número na posição [" + x + "]: ");
            lista[x] = input.nextInt();
        }
        System.out.print("\nInsira um número para pesquisar: ");
        valor= input.nextInt();

        System.out.println("\n_______________\n");

        for (int x = 0; x < lista.length; x++) {
            if (lista[x] == valor) {
                teste = true;
                System.out.println("Array["+x+"]");
            }
        }

        if (!teste)
            System.out.println("O número "+valor+" não existe no array.");
    }
}