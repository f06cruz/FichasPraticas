import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP03 | EX09__________");

        double num=0, count=0, resp=0, media;

        while (resp!=-1){
            System.out.print("Introduza um número: ");
            resp= input.nextDouble();
            num=num+resp;
            count=count+1;
        }
        num=num+1;
        count=count-1;
        media=num/count;
        System.out.println("Média: "+ media);

    }
}
