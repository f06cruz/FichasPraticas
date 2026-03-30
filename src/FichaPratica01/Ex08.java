package FichaPratica01;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP01 | EX08__________");

        int segundos , minutos , horas, tminutos, tsegundos;

        System.out.print("Minutos da música 1: ");
        minutos = input.nextInt();
        System.out.print("Segundos da música 1: ");
        segundos = input.nextInt();

        System.out.print("Minutos da música 2: ");
        minutos = minutos + input.nextInt();
        System.out.print("Segundos da música 2: ");
        segundos = segundos + input.nextInt();

        System.out.print("Minutos da música 3: ");
        minutos = minutos + input.nextInt();
        System.out.print("Segundos da música 3: ");
        segundos = segundos + input.nextInt();

        System.out.print("Minutos da música 4: ");
        minutos = minutos + input.nextInt();
        System.out.print("Segundos da música 4: ");
        segundos = segundos + input.nextInt();

        System.out.print("Minutos da música 5: ");
        minutos = minutos + input.nextInt();
        System.out.print("Segundos da música 5: ");
        segundos = segundos + input.nextInt();

        //calculos

        tsegundos = segundos % 60;
        minutos = minutos + (segundos / 60);
        tminutos = minutos % 60;
        horas = minutos / 60;

        System.out.println("O album tem " + horas + " h " + tminutos + " m " + tsegundos + "s");



    }
}
