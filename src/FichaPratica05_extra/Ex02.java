package FichaPratica05_extra;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX02__________");
        Scanner input = new Scanner(System.in);

        int [] array1 =new int[10];

        for (int x = 0; x <10; x++){
            System.out.print("Insira um número no Array ["+ x +"]: ");
            array1[x] = input.nextInt();
        }

        System.out.println("\n___________________\n");

        for (int x = 9; x>=0; x--){
            System.out.println(array1[x]);
        }
    }
}