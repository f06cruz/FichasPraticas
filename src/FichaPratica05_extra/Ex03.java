package FichaPratica05_extra;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX03__________");
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

        for (int x = 0; x < lista.length; x++) {
            if (lista[x] == valor) {
                teste = true;
                break;
            }
        }

        System.out.println("\n_______________\n");

        if (teste)
            System.out.println("O número "+valor+" existe no array.");
        else System.out.println("O número "+valor+" não existe no array.");
    }
}