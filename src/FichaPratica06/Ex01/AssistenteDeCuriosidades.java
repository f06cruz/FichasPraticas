package FichaPratica06.Ex01;

import java.util.Scanner;
import static FichaPratica06.Ex01.BibliotecaCuriosidades.*;
import static FichaPratica06.funcoesExtra.*;

public class AssistenteDeCuriosidades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n_________Assistente__________");

        int opcao, RespostaInt;
        boolean respostaBoolean;
        String respostaString, RespostaUtilizador;


        do {
            System.out.println("\nOpções:");
            System.out.println("1. Verificar se uma pessoa é maior de idade");
            System.out.println("2.Identificar a fase da vida");
            System.out.println("3.Mostrar a capital de um país");
            System.out.println("4.Indicar a estação do ano a partir do mês");
            System.out.println("5.Mostrar o dia da semana");
            System.out.println("6.Classificar um número");
            System.out.println("0.Sair");
            System.out.print("\nEscolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nIntroduza a idade: ");
                    RespostaInt =input.nextInt();
                    respostaBoolean =maiorDeIdade(RespostaInt);
                    if (respostaBoolean)
                        System.out.println("Maior de idade");
                    else System.out.println("Menor de idade");
                    break;
                case 2:
                    System.out.print("\nIntroduza a idade: ");
                    RespostaInt =input.nextInt();
                    respostaString =faseVida(RespostaInt);
                    System.out.println("\n"+ respostaString);
                    break;
                case 3:
                    System.out.println("\nEscolha um país: ");
                    System.out.println("Portugal");
                    System.out.println("Espanha");
                    System.out.println("França");
                    System.out.println("Itália");
                    System.out.println("Alemanha");
                    System.out.print("País: ");
                    RespostaUtilizador = input.next();
                    respostaString =capitalPais(RespostaUtilizador);
                    System.out.println("\n"+ respostaString);
                    break;
                case 4:
                    System.out.print("\nIntroduza o mês: ");
                    RespostaInt =input.nextInt();
                    respostaString =estacaoAno(RespostaInt);
                    System.out.println("\n"+ respostaString);
                    break;
                case 5:
                    System.out.print("\nIntroduza o dia da semana: ");
                    RespostaInt =input.nextInt();
                    respostaString =diaSemana(RespostaInt);
                    System.out.println("\n"+ respostaString);
                    break;
                case 6:
                    System.out.print("\nIntroduza número: ");
                    RespostaInt =input.nextInt();
                    respostaString =tipoNumero(RespostaInt);
                    System.out.println("\n"+ respostaString);
                    break;
                case 0:
                    terminar();
                    break;
                default:
                    System.out.println("\nErro");
            }
            if (opcao!=0)
                limparConsola();
        } while (opcao!=0);
        fecho();
    }
}
