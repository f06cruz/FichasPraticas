package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        //Import do Scanner
        Scanner input = new Scanner(System.in);

        //Criar variáveis podem se usadas apenas 3
        int valor1, valor2, soma, subtr, multi, div;

        System.out.println("_________FP01 | EX02__________");

        //Perguntar valor 1 ao utilizador
        System.out.print("Insira um número: ");
        valor1 = input.nextInt();

        //Perguntar valor 2 ao utilizador
        System.out.print("Insira um número: ");
        valor2 = input.nextInt();

        //Calculos
        soma = valor1 + valor2;
        subtr = valor1 - valor2;
        multi = valor1 * valor2;
        div = valor1 / valor2;

        //Apresentar resultados
        System.out.println("Soma: " + soma);
        System.out.println("Sutração: " + subtr);
        System.out.println("Multiplição: " + multi);
        System.out.println("Divisão: " + div);




    }
}
