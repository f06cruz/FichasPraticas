import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP03 | EX15__________");

        int num, cont;

        System.out.print("Introduza o fatorial: ");
        num = input.nextInt();
        cont = num;

        while (cont>1) {
            num = num * (cont-1);
            cont=cont-1;
        }
        System.out.println("Resultado:"+num);


    }
}
