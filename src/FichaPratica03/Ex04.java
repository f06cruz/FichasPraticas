package FichaPratica03;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP03 | EX04__________");

        int count=0,num;
        System.out.print("Introduza um número: ");
        num= input.nextInt();

        while (count<=num){
            System.out.println(count);
            count=count+1;
        }

    }
}
