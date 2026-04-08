import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP03 | EX12__________");

        int num=0, count1=0, count2=0, count3=0, count4=0;

        while (num>=0) {
            System.out.print("Introduza um número: ");
            num= input.nextInt();
            if (num>=0 && num<=25){
                    count1=count1+1;
                } else if (num>=26 && num<=50){
                    count2=count2+1;
                    } else if (num>=51 && num<=75){
                        count3=count3+1;
                        } else if (num>=76 && num<=100){
                            count4=count4+1;}

        }
        System.out.println("[00,25]: "+count1);
        System.out.println("[26,50]: "+count2);
        System.out.println("[51,75]: "+count3);
        System.out.println("[76,100]: "+count4);
    }
 }
