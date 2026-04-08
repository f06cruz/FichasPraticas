package FichaPratica04;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP04 | EX03__________");

        int al, num, cont = 1;

        System.out.print("Introduz um número: ");
        al = input.nextInt();

        do {
            System.out.print("Adivinhe o número (1 a 100): ");
            num = input.nextInt();

            if (num == al) {
                System.out.println("Boa! Ganhaste o jogo!");
            } else if (num > al) {
                System.out.println("Muito alto.");
                cont++;
                } else{
                    System.out.println("Muito baixo.");
                    cont++;}
        }while (al!=num);
        System.out.println("Tentativas: "+cont);
    }
}
