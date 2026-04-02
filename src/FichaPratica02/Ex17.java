package FichaPratica02;
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP02 | EX17__________");

        double saldo, credito;

        System.out.print("Escreva o saldo: ");
        saldo = input.nextDouble();

        if (saldo >=0&& saldo <=2000){
            System.out.println("Saldo Médio: " + saldo +"€");
            System.out.println("Não tem direito a crédito");}
        else if (saldo >2000&& saldo <=4000) {
            credito = saldo *0.2;
            System.out.println("Saldo Médio: " + saldo +"€");
            System.out.println("Valor do crédito: " + credito +"€");}
        else if (saldo >4000&& saldo <=6000) {
            credito = saldo *0.3;
            System.out.println("Taxa de 35%: " + credito +"€");}
        else if (saldo >6000) {
            credito = saldo *0.4;
            System.out.println("Taxa de 40%: " + credito +"€");}
        else
            System.out.print("Erro");


    }
}