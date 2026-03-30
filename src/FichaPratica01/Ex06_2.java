package FichaPratica01;


import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("_________FP01 | EX06__________");

        int valor1, valor2;

        System.out.print("Insira o 1º valor: ");
        valor1 = input.nextInt();

        System.out.print("Insira o 2º valor: ");
        valor2 = input.nextInt();

        //calculos
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println("O valor 1 é: " + valor1);
        System.out.println("O valor 2 é: " + valor2);


    }
}
