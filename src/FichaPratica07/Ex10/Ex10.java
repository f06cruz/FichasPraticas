package FichaPratica07.Ex10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.Ex10.menu10.menu;
import static FichaPratica07.funcoesExtra.*;

public class Ex10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("\n_________Músicas__________");

        File caminho =new File("Files/exercicio_10.csv");
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