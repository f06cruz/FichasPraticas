package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area, raio;

        System.out.println("_________FP01 | EX04__________");

        System.out.print("Insira o raio: ");
        raio = input.nextDouble();

        //calculos
        area = Math.PI * (raio * raio);

        System.out.println("Área: " + area);







    }
}
