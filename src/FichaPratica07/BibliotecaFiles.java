package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BibliotecaFiles {

    public static void lerImprimir(String caminho) throws FileNotFoundException {
        Scanner ler = new Scanner(new File(caminho));

        while (ler.hasNextLine()) {
            System.out.println(ler.nextLine());
        }
        ler.close( );
    }

    public static void escreverFicheiro(String caminho,String msg) throws FileNotFoundException {
        PrintWriter escrever = new PrintWriter(caminho);

        escrever.println(msg);
        escrever.close();
    }

    public static void escreverFicheiro2(String caminho1, String caminho2) throws FileNotFoundException {
        Scanner ler = new Scanner(new File(caminho1));
        PrintWriter escrever = new PrintWriter(caminho2);

        while (ler.hasNextLine()) {
            escrever.println(ler.nextLine());
        }
        ler.close( );
        escrever.close();
    }

    public static void soma(String caminho) throws FileNotFoundException {
        Scanner ler = new Scanner(new File(caminho));
        int total=0;

        while (ler.hasNextLine()) {
            total+=ler.nextInt();
        }
        ler.close( );
        System.out.println(total);
    }

    public static void maiorIdade(String caminho) throws FileNotFoundException {
        Scanner ler = new Scanner(new File(caminho));
        int maior=0;
        String idoso="Ninguem";

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] items = linha.split(",");
            if (Integer.parseInt(items[1]) > maior) {
                maior = Integer.parseInt(items[1]);
                idoso = items[0];
            }
        }
        ler.close( );
        System.out.println("A pessoa mais velha é "+idoso+" com "+maior+" anos");
    }

    public static void contador(String caminho) throws FileNotFoundException {
        Scanner ler = new Scanner(new File(caminho));
        int contl =0, contp=0;

        while (ler.hasNextLine()) {
            contl++;
            String linha = ler.nextLine();
            String[] palavras = linha.split(" ");
            for(int x=0; x< palavras.length;x++)
                contp++;
        }
        ler.close( );
        System.out.println("\nNum. linhas: "+contl);
        System.out.println("Num. palavras: "+contp);
    }

    public static void somaVendas(String caminho) throws FileNotFoundException {
        Scanner ler = new Scanner(new File(caminho));
        double total=0,temp, totalp =0;
        int temp2,totalv=0;

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] items = linha.split(",");
            if(!items[0].equals("tipo_produto")) {
                temp2=Integer.parseInt(items[2]);
                totalv+=temp2;
                temp=temp2;
                total += temp * Double.parseDouble(items[3]);
                totalp +=Double.parseDouble(items[3]);
            }
        }
        ler.close( );
        System.out.println("Total de vendas: "+totalv);
        System.out.println("Valor total dos produtos: "+totalp);
        System.out.println("Valor total de vendas: "+total);
    }
}
