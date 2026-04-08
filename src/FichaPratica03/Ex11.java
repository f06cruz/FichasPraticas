import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP03 | EX11__________");

        int limite, salto, num=0;

        System.out.print("Introduza um limite: ");
        limite= input.nextInt();
        System.out.print("Introduza um salto: ");
        salto= input.nextInt();

        while (num<=limite) {
            System.out.println(num);
            num = num + salto;
        }
    }
}
