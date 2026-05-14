package FichaPratica07.Ex10;

import java.util.Scanner;

import static FichaPratica07.Ex10.B10.*;
import static FichaPratica07.funcoesExtra.*;

public class menu10 {

    public static int menu(String [][] matriz) {
        Scanner input = new Scanner(System.in);
        int opcao;
        String respostaString;

        System.out.println("_________Formandos__________");
        System.out.println("Opções:");
        System.out.println("1.Imprimir todos os formandos");
        System.out.println("2.Imprimir todas as informações do formando");
        System.out.println("3.Informações e número de formandos num curso");
        System.out.println("4.Imprimir o aluno mais velho");
        System.out.println("5.Imprimir alunos que estão inscritos em mais de um curso");
        System.out.println("6.Número de formandos no ficheiro");
        System.out.println("0.Sair");
        System.out.print("\nOpção: ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                imprimir(matriz);
                break;
            case 2:
                System.out.print("\nIntroduza a matricula: ");
                respostaString = input.next();
                imprimir2(matriz, respostaString);
                break;
            case 3:
                System.out.print("\nIntroduza o curso: ");
                respostaString = input.next();
                imprimir3(matriz,respostaString);
                break;
            case 4:
                    imprimir4(matriz);
                    break;
            case 5:
                imprimir5(matriz);
                break;
            case 6:
                System.out.print("\nExistem " + matriz.length + " formandos.");
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
