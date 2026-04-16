package FichaPratica05;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX01__________");
        Scanner input = new Scanner(System.in);

        int [] armario =new int[10];

        System.out.println("\n_________Ler armário__________\n");

        for (int i=0;i<10;i++){
            System.out.print("Insira um número no armário ["+i+"]:");
            armario[i] = input.nextInt();
        }

        System.out.println("\n_________Imprimir armário__________\n");

        for (int i=0;i<10;i++){
            System.out.println("armario ["+i+"]: "+ armario[i]);
        }
    }
}
