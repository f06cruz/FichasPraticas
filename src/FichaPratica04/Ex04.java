package FichaPratica04;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP04 | EX04__________");

        int num, cont=1, res=0;

        System.out.println("Introduza um número.");
        num= input.nextInt();

        while (cont!=num) {
            if (num%cont!=0)
                res=1;
            else if (num%1==0 && num%num==0)
                res=2;
            cont++;
        }
        switch (res) {
            case 1 :{
                System.out.println("Não Primo");
                break;}
            case 2 :{
                System.out.println("Primo");
                break;}

        }

    }
}
