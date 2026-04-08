package FichaPratica02_extra;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02.1 | EX05__________");

        int al = 87, num;

        System.out.print("Adivinhe o número (1 a 100): ");
        num = input.nextInt();


        if (num == al) {
            System.out.println("Boa! Ganhaste o jogo!");
        } else {
            if (num > al) {
                System.out.println("Muito alto.");
            } else System.out.println("Muito baixo.");
            System.out.print("Adivinhe o número (1 a 100): ");
            num = input.nextInt();
            if (num == al) {
                System.out.println("Boa! Ganhaste o jogo!");
            } else {
                if (num > al) {
                    System.out.println("Muito alto.");
                    System.out.println("Ficaste sem tentativas...");
                } else {
                    System.out.println("Muito baixo.");
                    System.out.println("Ficaste sem tentativas...");
                }
            }

        }
    }
}
