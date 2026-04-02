package FichaPratica02;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX07__________");

        int num1;

        System.out.print("Escreva o valor: ");
        num1 = input.nextInt();

        if (num1 % 2 == 0)
            System.out.println("O valor é par");
        else System.out.println("O valor é ímpar");

    }
}
