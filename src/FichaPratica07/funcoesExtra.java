package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
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

    public static void imprimir(String [][] matriz){
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length-1; y++) {
                System.out.print(matriz[x][y] + "||");
            }
            System.out.print(matriz[x][matriz[x].length-1]);
            System.out.println();
        }
    }

    public static String [][] transformarMatriz(File caminho, String delimitador) throws FileNotFoundException {
        Scanner ler = new Scanner(caminho);
        int cont=0;

        String[][] matriz = new String[linhas(caminho)][colunas(caminho,delimitador)];

        ler.nextLine();
        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] array = linha.split(delimitador);
            for (int x = 0; x < matriz[0].length; x++)
                matriz[cont][x] = array[x];
            cont++;
        }

        //for (int x = 0; x < matriz.length; x++) {
        //    for (int y = 0; y < matriz[x].length; y++) {
        //        System.out.print(matriz[x][y] + "||");
        //    }
        //    System.out.println();
        //}
        return matriz;
    }

    public static int linhas(File caminho) throws FileNotFoundException {
        Scanner ler = new Scanner(caminho);
        int linhas = 0;

        while (ler.hasNextLine()) {
            ler.nextLine();
            linhas++;
        }
        return (linhas-1);
    }

    public static int colunas(File caminho, String delimitador) throws FileNotFoundException {
        Scanner ler = new Scanner(caminho);
        String[] array = ler.nextLine().split(delimitador);
        return array.length;
    }

}
