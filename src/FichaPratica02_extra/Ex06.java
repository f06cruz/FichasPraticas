package FichaPratica02_extra;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02.1 | EX06__________");

        int ano;

        System.out.print("Escreva o ano: ");
        ano= input.nextInt();

        if (ano%4==0)
            System.out.println("Bissexto");
        else System.out.println("Não Bissexto");

    }
}
