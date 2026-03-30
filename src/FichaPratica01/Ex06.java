package FichaPratica01;


import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("_________FP01 | EX06__________");

        double valor1, valor2;

        System.out.print("Insira o 1º valor: ");
        valor1 = input.nextDouble();

        System.out.print("Insira o 2º valor: ");
        valor2 = input.nextDouble();

        System.out.println("O resultado é: " + (valor1 + (valor2 - 1) * 2));


    }
}
