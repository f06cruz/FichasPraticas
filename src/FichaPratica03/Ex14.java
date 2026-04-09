import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP03 | EX14__________");

        int num1, num2, temp=0, resultado=0;

        System.out.print("Quantos números deseja inserir: ");
        num1 = input.nextInt();

        while (num1 >0) {
            System.out.print("Introduza um número: ");
            num2= input.nextInt();
            if (num2 < temp)
                resultado=1;
            temp=num2;
            num1--;
        }
        System.out.println("\n");
        if (resultado==0)
            System.out.println("Crescente");
        else System.out.println("Não crescente");
    }
}
