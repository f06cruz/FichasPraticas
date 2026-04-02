package FichaPratica02;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX16__________");

        int valor, n200, n100, n50, n10, n20, n5;

        System.out.print("Escreva o valor: ");
        valor = input.nextInt();

        if (valor >= 200) {
            n200=valor/200;
            valor=(valor%200);
            System.out.println("Notas de 200: " + n200);
            }
        if (valor >= 100) {
            n100=valor/100;
            valor=(valor%100);
            System.out.println("Notas de 100: " + n100);
        }
        if (valor >= 50) {
            n50=valor/50;
            valor=(valor%50);
            System.out.println("Notas de 50: " +n50);
        }
        if (valor >= 20) {
            n20=valor/20;
            valor=(valor%20);
            System.out.println("Notas de 20: " +n20);
        }
        if (valor >= 10) {
            n10=valor/10;
            valor=(valor%10);
            System.out.println("Notas de 10: " +n10);
        }
        if (valor >= 5) {
            n5=valor/5;
            valor=(valor%5);
            System.out.println("Notas de 5: "+n5);
        }

    }
}
