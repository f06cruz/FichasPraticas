package FichaPratica03;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP03 | EX05__________");

        int num;
        String msg;


        System.out.print("Introduza um Número :");
        num = input.nextInt();
        System.out.print("Introduza uma mensagem: ");
        input.nextLine();
        msg = input.nextLine();


        while (num > 0) {
            System.out.println(msg);
            num = num - 1;
        }
    }
}
