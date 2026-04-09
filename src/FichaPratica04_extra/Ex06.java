package FichaPratica04_extra;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        System.out.println("_________FP04.1 | EX06__________");
        Scanner input = new Scanner(System.in);

        int num = 1, maior = 0, menor = 99999999;

        while (num != 0) {
            System.out.print("Introduza um número: ");
            num = input.nextInt();
            if (num > maior)
                maior = num;
            if (num < menor && num != 0)
                menor = num;
        }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);

    }
}
