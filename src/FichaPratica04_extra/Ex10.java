package FichaPratica04_extra;

import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        System.out.println("_________FP04.1 | EX10__________");
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Inserir número: ");
        num= input.nextInt();
        System.out.println();
        while (num>0) {
            System.out.print(num%10);
            num/=10;
        }
    }
}
