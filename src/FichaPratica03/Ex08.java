import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP03 | EX08__________");

        int num1, num2;

        System.out.print("Introduza um número: ");
        num1= input.nextInt();

        num2=num1-5;
        while (num1>num2){
            System.out.println(num2);
            num2=num2+1;
        }
        System.out.println();
        num2=num1+5;
        while (num1<num2){
            num1=num1+1;
            System.out.println(num1);

        }
    }
}
