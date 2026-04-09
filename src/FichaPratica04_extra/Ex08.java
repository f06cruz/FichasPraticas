package FichaPratica04_extra;

import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        System.out.println("_________FP04.1 | EX08__________");
        Scanner input = new Scanner(System.in);

        int num1, num2, num3=1;

        System.out.print("1º Número: ");
        num1= input.nextInt();
        System.out.print("2º Número: ");
        num2= input.nextInt();

        while (num2>0) {
            num3=num3*num1;
            num2--;
        }
        System.out.println("Resultado: "+num3);
    }
}
