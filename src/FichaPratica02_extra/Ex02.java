package FichaPratica02_extra;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02.1 | EX02__________");

        double peso;

        System.out.print("Introduza o peso (em Kg.): ");
        peso= input.nextDouble();

        if (peso>0){
            peso=peso*0.16;
            System.out.println("Peso na lua: "+peso+ "Kg.");
        }
    }
}
