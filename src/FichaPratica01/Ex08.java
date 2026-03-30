package FichaPratica01;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP01 | EX08__________");

        int segundos=0, minutos=0, horas=0, tminutos=0, tsegundos=0;

        System.out.print("Minutos da musica 1: ");
        minutos = minutos + input.nextInt();
        System.out.print("Segundos da música 1: ");
        segundos = segundos + input.nextInt();

        System.out.print("Minutos da musica 2: ");
        minutos = minutos + input.nextInt();
        System.out.print("Segundos da música 2: ");
        segundos = segundos + input.nextInt();

        System.out.print("Minutos da musica 3: ");
        minutos = minutos + input.nextInt();
        System.out.print("Segundos da música 3: ");
        segundos = segundos + input.nextInt();

        System.out.print("Minutos da musica 4: ");
        minutos = minutos + input.nextInt();
        System.out.print("Segundos da música 4: ");
        segundos = segundos + input.nextInt();

        System.out.print("Minutos da musica 5: ");
        minutos = minutos + input.nextInt();
        System.out.print("Segundos da música 5: ");
        segundos = segundos + input.nextInt();

        //calculos

        tsegundos = segundos % 60;
        tminutos = (tsegundos + minutos) % 60;
        horas = tminutos % 60;

        System.out.println("O album tem " + horas + " h " + tminutos + " m " + tsegundos + "s");



    }
}
