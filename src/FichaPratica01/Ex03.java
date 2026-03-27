package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float area, base, altura, perimetro;

        System.out.println("_________FP01 | EX03__________");

        System.out.print("Insira a base: ");
        base = input.nextInt();

        System.out.print("Insira a altura: ");
        altura = input.nextInt();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);


    }
}
