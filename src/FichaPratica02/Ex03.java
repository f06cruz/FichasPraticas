package FichaPratica02;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX03__________");

        double salario, imposto;

        System.out.print("Escreva o salario: ");
        salario = input.nextDouble();

        if (salario>0&&salario<=15000){
            imposto= salario*0.2;
            System.out.println("Taxa de 20%: " + imposto +"€");}
        else if (salario>15000&&salario<=20000) {
            imposto = salario*0.3;
            System.out.println("Taxa de 30%: " + imposto +"€");}
        else if (salario>20000&&salario<=25000) {
            imposto = salario*0.35;
            System.out.println("Taxa de 35%: " + imposto +"€");}
        else if (salario>25000) {
            imposto= salario*0.40;
            System.out.println("Taxa de 40%: " + imposto +"€");}
        else
            System.out.print("Erro");



    }

}






