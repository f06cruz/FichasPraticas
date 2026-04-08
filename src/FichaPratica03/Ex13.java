import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP03 | EX13__________");

        int num1, num2;

        System.out.print("Insira o 1º número: ");
        num1 = input.nextInt();
        System.out.print("Insira o 2º número: ");
        num2 = input.nextInt();

        while (num1 != num2) {
            if (num1%5==0)
                System.out.println(num1);
            num1=num1+1;
        }

    }
}
