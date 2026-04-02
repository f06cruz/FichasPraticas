package FichaPratica02;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX11__________");

        int saldo, valor, resultado;

        System.out.print("Introduza o saldo médio: ");
        saldo= input.nextInt();
        System.out.print("Introduza o valor a movimentar: ");
        valor= input.nextInt();

        resultado= saldo+valor;
        valor= 0-valor;

        if (saldo>valor && valor!=0)
            System.out.print("Saldo Atual: "+resultado);
        else {System.out.println("Operação Inválida. Saldo Insuficiente");
            System.out.print("Saldo Atual: "+saldo);}


    }
}
