package FichaPratica04_extra;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        System.out.println("_________FP04.1 | EX07__________");
        Scanner input = new Scanner(System.in);

        int num=1, contp=0, contn=0;

        while(num!=0) {
            System.out.print("Introduza um número: ");
            num= input.nextInt();
            if (num>0)
                contp++;
            if (num<0)
                contn++;
        }
        System.out.println();
        System.out.println("Positivos: "+contp);
        System.out.println("Menor: "+contn);

    }
}
