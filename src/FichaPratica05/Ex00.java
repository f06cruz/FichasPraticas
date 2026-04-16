package FichaPratica05;
import java.util.Scanner;
public class Ex00 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX00__________");
        Scanner input = new Scanner(System.in);

        int [][] armario =new int[2][2];

        System.out.println("\n_________Ler armário__________\n");

        for (int i=0;i<2;i++) {
            for (int o = 0; o < 2; o++) {
                System.out.print("Insira um número no armário [" + i + "][" + o+"]:");
                armario[i][o] = input.nextInt();
            }
        }

        System.out.println("\n_________Imprimir armário__________\n");

        for (int i=0;i<2;i++) {
            for (int o = 0; o < 2; o++) {
                System.out.println("armario ["+i+"][" + o + "]:" + + armario[i][o]);
            }
        }
    }
}