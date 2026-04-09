package FichaPratica04;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP04 | EX04__________");

        int num, cont=2;
        boolean res=true;

        System.out.print("Introduza um número: ");
        num= input.nextInt();

        while (cont<=num){
            if (num%cont==0 && cont!=num)
                res=false;
            cont++;
        }
        
        if (res)
            System.out.println("Primo");
        else System.out.println("Não Primo");
    }

}

