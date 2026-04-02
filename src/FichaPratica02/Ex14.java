package FichaPratica02;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX14__________");

        int num1, num2, num3;

        System.out.print("Escreva o 1º valor: ");
        num1 = input.nextInt();
        System.out.print("Escreva o 2º valor: ");
        num2 = input.nextInt();
        System.out.print("Escreva o 3º valor: ");
        num3 = input.nextInt();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        }

        if (num1 <= num3 && num3 <= num2) {
            System.out.println(num1 + " " + num3 + " " + num2);
        }

        if (num2 <= num1 && num1 <= num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        }

        if (num2 <= num3 && num3 <= num1) {
            System.out.println(num2 + " " + num3 + " " + num1);
        }

        if (num3 <= num1 && num1 <= num2) {
            System.out.println(num3 + " " + num1 + " " + num2);
        }

        if (num3 <= num2 && num2 <= num1) {
            System.out.println(num3 + " " + num2 + " " + num1);
        }




    }
}
