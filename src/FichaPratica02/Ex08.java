package FichaPratica02;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX08__________");

        double nota1, nota2, nota3, mediaf;

        System.out.print("Escreva a 1ª nota: ");
        nota1 = input.nextDouble();
        System.out.print("Escreva a 2ª nota: ");
        nota2 = input.nextDouble();
        System.out.print("Escreva a 3ª nota: ");
        nota3 = input.nextDouble();

        mediaf = (nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.4);

        if (mediaf >= 9.5)
            System.out.print(mediaf +" Aprovado");
        else
            System.out.print(mediaf +" Reprovado");

    }
}
