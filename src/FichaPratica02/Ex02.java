package FichaPratica02;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX02__________");

        double salario, imposto;

        System.out.print("Introduza o salário: ");
        salario= input.nextDouble();

        if ( salario <= 15000){
            imposto = salario * 0.2;
            System.out.println("Taxa de 20%: " + imposto +"€");}
        else {
            imposto = salario * 0.3;
            System.out.println("Taxa de 30%: " + imposto +"€");}

    }
}
