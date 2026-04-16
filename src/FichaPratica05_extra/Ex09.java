package FichaPratica05_extra;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {

        System.out.println("_________FP05.1 | EX09__________");
        Scanner input = new Scanner(System.in);

        int [] array1 =new int[5];
        int temp;

        for (int x = 0; x < array1.length; x++){
            System.out.print("Insira um número no Array ["+ x +"]: ");
            array1[x] = input.nextInt();
        }

        for (int x = 1; x < array1.length; x++){
            if(array1[x]<array1[x-1]){
                temp=array1[x-1];
                array1[x-1]=array1[x];
                array1[x]=temp;

            }
        }

        System.out.println("\n___________________\n");

        for (int x = 0; x < array1.length; x++){
            System.out.println(array1[x]);
        }
    }
}