package FichaPratica07.Ex09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.Ex09.menu09.menu;
import static FichaPratica07.funcoesExtra.*;

public class Ex09 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("\n_________Músicas__________");

        File caminho =new File("Files/exercicio_09.csv");
        int opcao;

        String[][] matriz =transformarMatriz(caminho,",");
        terminar();

        do {
            opcao=menu(matriz);
            if (opcao!=0)
                limparConsola();
        } while (opcao!=0);
        terminar();
        fecho();
    }
}