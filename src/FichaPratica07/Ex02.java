package FichaPratica07;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFiles.escreverFicheiro;

public class Ex02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String msg;
        System.out.println("Escreva uma mensagem");
        msg=input.nextLine();
        escreverFicheiro("C:/Users/swd13/OneDrive - CESAE/IdeaProjects/FichasPraticas/Files/exercicio_02.txt",msg);
    }
}
