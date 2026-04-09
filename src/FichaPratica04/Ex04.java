package FichaPratica04;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP04 | EX04__________");

        int num, cont=2, res=1;

        System.out.print("Introduza um número: ");
        num= input.nextInt();

        while (cont<=num){
            if (num%cont==0 && cont!=num){
                res=2;
                break;}
            cont++;
        }

        switch (res) {
            case 1 :{
                System.out.println("Primo");
                break;}
            case 2 :{
                System.out.println("Não Primo");
                break;}

        }

    }
}
