package FichaPratica04_extra;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("_________FP04.1 | EX03__________");

        int num1=1, num2, num3;

        while (num1<=10){
            System.out.println("Tabuada do "+num1);
            num2=1;
            while(num2<=10){
                num3=num1*num2;
                System.out.println(num1+" x "+num2+" = "+num3);
                num2++;
            }
            System.out.println();
            num1++;
        }
    }
}
