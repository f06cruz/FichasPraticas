package FichaPratica02_extra;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02.1 | EX04__________");

       String letra;
        System.out.print("Introduza uma letra: ");
        letra = input.next();

        switch (letra) {
            case("a"): {
                System.out.println("vogal");
                break;}
            case("e"): {
                System.out.println("vogal");
                break;}
            case("i"): {
                System.out.println("vogal");
                break;}
            case("o"): {
                System.out.println("vogal");
                break;}
            case("u"): {
                System.out.println("Vogal");
            break;}
            default: {
                System.out.println("Consoante");
            }
        }
    }
}
