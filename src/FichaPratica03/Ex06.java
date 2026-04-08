package FichaPratica03;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP03 | EX06__________");

        int num1, num2;

        System.out.print("Introduza o número de início: ");
        num1 = input.nextInt();
        System.out.print("Introduza o número de fim: ");
        num2 = input.nextInt();

        if (num2 >= num1) {
            while (num2 >= num1) {
                System.out.println(num1);
                num1=num1+1;
            }
        } else System.out.println("erro");
    }
}
