package FichaPratica01;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP01 | EX07__________");

        double valor1, valor2, valor3, resultado;

        System.out.print("insira o 1º valor: ");
        valor1 = input.nextDouble();

        System.out.print("insira o 2º valor: ");
        valor2 = input.nextDouble();

        System.out.print("insira o 3º valor: ");
        valor3 = input.nextDouble();

        resultado = (valor1 +valor2 + valor3) - ((valor1 +valor2 + valor3)*0.1);

        System.out.println("O resultado é: " + resultado);

    }
}
