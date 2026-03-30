package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP01 | EX05__________");

        double valor1, valor2, valor3, media, mediap;

        System.out.print("Insira o 1º valor: ");
        valor1 = input.nextDouble();

        System.out.print("Insira o 2º valor: ");
        valor2 = input.nextDouble();

        System.out.print("Insira o 3º valor: ");
        valor3 = input.nextDouble();

        //calculos

        media = (valor1 + valor2 + valor3) / 3;
        mediap = (valor1 * 0.2 + valor2 * 0.3 + valor3 * 0.5);

        System.out.println("média = " + media);
        System.out.println("média ponderada = " + mediap);



    }
}
