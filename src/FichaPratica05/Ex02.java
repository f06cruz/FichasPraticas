package FichaPratica05;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {

        System.out.println("_________FP05 | EX02__________");
        Scanner input = new Scanner(System.in);

        double [] meses =new double[12];
        double total=0;


        for (int i=0;i<12;i++){
            System.out.print("Insira o valor do mês "+(i+1)+": ");
            meses[i] = input.nextDouble();
        }

        for (int i=0;i<12;i++){
            total+=meses[i];
        }

        //for (int i=0;i<12;i++) {
       //     System.out.println("mês " + (i + 1) + ":"+meses[i]);
        //}

        System.out.println("\n_______________\n");

        System.out.println("\nTotal: "+total);

    }
}