package FichaPratica02;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX05__________");

        int num1, num2;

        System.out.print("Escreva o 1º valor: ");
        num1 = input.nextInt();
        System.out.print("Escreva o 2º valor :");
        num2 = input.nextInt();

        if (num1 == num2)
            System.out.println("Os valores são iguais");
        else {
            if (num1 > num2)
                System.out.println(num2 + "   " + num1);
            else System.out.println(num1 + "   " + num2);
        }
    }
}
