package FichaPratica04_extra;

public class Ex04_3 {
    public static void main(String[] args) {
        System.out.println("_________FP04.1 | EX04.3__________");

        //+2 1 3 5 7 9   4 3 2 1

        int num1, num2, num3=4;

        for (num1 = 1; num1 <= 5; num1++) {
            //for (num2 = 1; num2 <= 9; num2++) {
                if (num3==4)
                    System.out.print("    *    ");
                if (num3==3)
                    System.out.print("   ***   ");
                if (num3==2)
                    System.out.print("  *****  ");
                if (num3==1)
                    System.out.print(" ******* ");
                if (num3==0)
                    System.out.print("*********");
           // }
            num3--;
            System.out.println();
        }

    }
}
