package FichaPratica06.Ex05;
import java.util.Scanner;
import static FichaPratica06.Ex05.BibliotecaMatrizes.*;
import static FichaPratica06.funcoesVoid.*;

public class AnaliseMatrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n_________Análise__________");

        int opcao,linhas,colunas, valor, resultado;
        boolean resultadoBoolean;


        linhas=tamanho("linhas");
        colunas=tamanho("colunas");

        int [][] matriz = new int[linhas][colunas];

        matriz = preencherMatriz(linhas,colunas);

        do {
            resultadoBoolean=false;
            System.out.println("\nOpções:");
            System.out.println("1.Maior Elemento");
            System.out.println("2.Menor Elemento");
            System.out.println("3.Somatório dos Elementos");
            System.out.println("4.Média dos Elementos");
            System.out.println("5.Soma da Diagonal Principal");
            System.out.println("6.Quantidade de Pares");
            System.out.println("7.Procurar um Valor");
            System.out.println("0.Sair");
            System.out.print("\nEscolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    resultado =maiorElemento(matriz);
                    System.out.println("\nMaior Elemento: "+ resultado);
                    break;
                case 2:
                    resultado =menorElemento(matriz);
                    System.out.println("\nMenor Elemento: "+ resultado);
                    break;
                case 3:
                    resultado =somatorio(matriz);
                    System.out.println("\nSomatório dos Elementos: "+ resultado);
                    break;
                case 4:
                    resultado =media(matriz);
                    System.out.println("\nMédia dos Elementos: "+ resultado);
                    break;
                case 5:
                    resultado=somaDiagonalPrincipal(matriz);
                    System.out.println("\nSoma da Diagonal Principal: "+ resultado);
                    break;
                case 6:
                    resultado =contarPares(matriz);
                    System.out.println("\nQuantidade de Pares: "+ resultado);
                    break;
                case 7:
                    System.out.print("\nIntroduza o valor: ");
                    valor =input.nextInt();
                    resultadoBoolean =existeValor(matriz,valor);
                    if (!resultadoBoolean)
                        System.out.println("\nNão existe");
                    else
                        System.out.println("\nExiste");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Erro");
            }
            if (opcao!=0)
                limparConsola();
        } while (opcao!=0);

        System.out.println("\nA fechar assistente...");
        fecho();
    }
}