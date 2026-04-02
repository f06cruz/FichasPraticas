package FichaPratica02;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX09__________");

        int num1, num2, num3;

        System.out.print("Escreva o 1º valor: ");
        num1 = input.nextInt();
        System.out.print("Escreva o 2º valor :");
        num2 = input.nextInt();
        System.out.print("Escreva o 3º valor :");
        num3 = input.nextInt();

         if (num1<num2 && num1<num3) {
            System.out.print("Menor: "+num1); }
        else if (num2<num1 && num2<num3) {
            System.out.print("Menor: "+num2);}
        else if (num3<num1 && num3<num2) {
            System.out.print("Menor: "+num3);}
        else
             System.out.print("Erro");


    }
}
