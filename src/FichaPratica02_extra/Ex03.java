package FichaPratica02_extra;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02.1 | EX03__________");

        int valor;
        System.out.print("Intoduza o preço: ");
        valor = input.nextInt();

        if (valor > 100)
            System.out.println("Preço Final " + (valor * .9) + " (10% de desconto)");
        else System.out.println("Preço Final " + valor + " Sem desconto");
    }
    }

