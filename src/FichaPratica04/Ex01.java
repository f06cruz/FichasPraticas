package FichaPratica04;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP04 | EX01__________");

        double num1, num2, resultado;
        String operacao, cont;

        do {

            System.out.print("Escreva o 1º número: ");
            num1 = input.nextDouble();
            System.out.print("Escreva o 2º número: ");
            num2 = input.nextDouble();
            System.out.println("Escreva o simbolo da operação que pretende fazer: ");
            System.out.println("Opções: + - * /");
            System.out.print("Escolha: ");
            operacao = input.next();

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
            do {
                System.out.println("Deseja continuar? s/n");
                cont= input.next();
                switch (cont) {
                    case "s" :
                        cont="s";
                        break;
                    case "n" :
                        cont="n";
                        break;
                    default:
                        System.out.println("Erro");
                        cont="e";
                }
            } while (cont.equals("e"));
        }while (cont.equals("s"));



    }
}
