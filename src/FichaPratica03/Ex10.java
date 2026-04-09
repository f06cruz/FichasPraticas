import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP03 | EX10__________");

        int num=1, resp;

        System.out.print("Introduza um número: ");
        resp= input.nextInt();

        while (num<=resp) {
            if (num%2==0)
                System.out.println(num);
            num++;
        }
    }
}
