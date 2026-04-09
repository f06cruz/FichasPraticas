package FichaPratica03;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println("_________FP03 | EX07__________");

        int num=1, total=0;

        while (num<=100){
            System.out.println(num);
            total=total+num;
            num++;
        }
        System.out.println("Somatório: "+total);
    }
}
