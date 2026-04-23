package FichaPratica06;
import java.util.Scanner;

public class funcoesVoid {

    public static void fecho() {
        System.out.println("\n-----------------------");
        System.out.println("     Feito por:");
        System.out.println("     Filipe Cruz");
        System.out.println("-----------------------");
    }

    /**
     * Limpar consola e primir enter para continuar
     */
    public static void limparConsola(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------");
        System.out.println("\nPrima Enter para continuar");
        input.nextLine();
        for (int x=0;x<200;x++)
            System.out.println();
    }

}
