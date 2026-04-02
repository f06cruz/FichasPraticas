package FichaPratica02;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX10__________");

        double num1, num2,resultado;
        String operacao;

        System.out.print("Escreva o 1º número: ");
        num1=input.nextDouble();
        System.out.print("Escreva o 2º número: ");
        num2=input.nextDouble();
        System.out.println("Escreva o simbolo da operação que pretende fazer: ");
        System.out.println("Opções: + - * /");
        System.out.print("Escolha: ");
        operacao=input.next();

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println("O resultado é " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("O resultado é " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("O resultado é " + resultado);
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println("O resultado é " + resultado);
                break;
            default:
                System.out.println("Erro");
        }


    }
}

//if (operacao.equals("+")
//if (!operacao.equals(+)