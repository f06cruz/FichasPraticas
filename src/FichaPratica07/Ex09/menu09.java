package FichaPratica07.Ex09;

import java.util.Scanner;

import static FichaPratica07.Ex09.B09.*;
import static FichaPratica07.funcoesExtra.*;

public class menu09 {

    public static int menu( String [][] matriz) {
        Scanner input = new Scanner(System.in);
        int opcao, RespostaInt,RespostaInt2;
        String respostaString;
        boolean respostaboolean;

        System.out.println("_________Músicas__________");
        System.out.println("Opções:");
        System.out.println("1.Pesquisar por género");
        System.out.println("2.Pesquisar por artista");
        System.out.println("3.Pesquisar por maior duração");
        System.out.println("4.Pesquisar por músicas com duração acima de valor especificado");
        System.out.println("5.Número de músicas");
        System.out.println("0.Sair");
        System.out.print("\nOpção: ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("\nIntroduza o género: ");
                respostaString = input.next();
                genero(matriz, respostaString);
                break;
            case 2:
                System.out.print("\nIntroduza o artista: ");
                respostaString = input.next();
                artista(matriz, respostaString);
                break;
            case 3:
                maior(matriz);
                break;
            case 4:
                do {
                    System.out.println("\nIntroduza a duração da música");
                    System.out.print("Minutos: ");
                    RespostaInt = input.nextInt();
                    System.out.print("Segundos: ");
                    RespostaInt2 = input.nextInt();
                    acimaDuracao(matriz, RespostaInt, RespostaInt2);
                    respostaboolean=simNao();
                } while (respostaboolean);
                break;
            case 5:
                System.out.print("\nExistem " + matriz.length + " músicas na lista.");
                break;
            case 0:
                terminar();
                break;
            default:
                System.out.println("\nErro");
        }
        return opcao;
    }
}
