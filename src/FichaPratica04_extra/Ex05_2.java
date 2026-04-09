package FichaPratica04_extra;

public class Ex05_2 {
    public static void main(String[] args) {
        System.out.println("_________FP04.1 | EX05.2__________");

        int num1,num2,num3=5,num4,num5=0;

        for(num1 =1; num1 <=5; num1++){
            for(num2=1;num2<=9;num2++){
                if(num2==num3){
                    for(num4=num1+num5;num4>0;num4--){
                        System.out.print(num1);}}
                else System.out.print(" ");
            }
            num5++;
            num3--;
            System.out.println();
        }

    }
}
