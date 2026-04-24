package FichaPratica07;
import java.util.Scanner;

public class funcoesExtra {

    /**
     * Copyright
     */
    public static void fecho() {
        System.out.println("\nA fechar...");
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

    /**
     * Limpar consola s/ precisar de primir enter para continuar
     */
    public static void terminar(){

        System.out.println("\n--------------------------");
        for (int x=0;x<200;x++)
            System.out.println();
    }

    public static Boolean simNao() {
        Scanner input = new Scanner(System.in);
        String x="x";
        while (!x.equalsIgnoreCase("s") || !x.equalsIgnoreCase("n")){
            System.out.println("\n------------");
            System.out.println("\nRepetir? s/n");
            x=input.nextLine();
            if (x.equalsIgnoreCase("s") )
                return true;
            else if (x.equalsIgnoreCase("n"))
                return false;
            else System.out.println("\nErro");
        }
        return null;
    }


}
