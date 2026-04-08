package FichaPratica02;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX13__________");

        int horas, minutos;

        System.out.print("Horas: ");
        horas= input.nextInt();
        System.out.print("Minutos: ");
        minutos= input.nextInt();

        if (horas>=0 && horas<=23 && minutos >=0 && minutos<=59){
            if (horas<=11 && minutos<=59)
                System.out.print(horas+":"+minutos+" AM");
            else System.out.print(horas-12+":"+minutos+" PM");}
        else
            System.out.print("Erro");
    }
}
