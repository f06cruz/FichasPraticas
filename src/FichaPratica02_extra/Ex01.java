package FichaPratica02_extra;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02.1 | EX01__________");

        int anos;
        System.out.print("Introduza a idade: ");
        anos= input.nextInt();

        if (anos>=18)
            System.out.println("Maior de idade.");
        else System.out.println("Menor de idade.");

    }
}