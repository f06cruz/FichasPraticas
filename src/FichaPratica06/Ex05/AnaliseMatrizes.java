package FichaPratica06.Ex05;
import java.util.Scanner;
import static FichaPratica06.Ex05.BibliotecaMatrizes.*;
import static FichaPratica06.funcoesExtra.*;

public class AnaliseMatrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n_________Análise de Matrizes__________");

        int opcao, valor, linha, coluna;

        /*int [][] matriz = new int[tamanho("linhas")][tamanho("colunas")];

        matriz = preencherMatriz(matriz.length,matriz[0].length);*/

        int [][] matriz = preencherMatriz(tamanho("linhas"),tamanho("colunas"));

        do {
            escreverMatriz(matriz);
            System.out.println("\nOpções:");
            System.out.println("1.Maior Elemento");
            System.out.println("2.Menor Elemento");
            System.out.println("3.Somatório dos Elementos");
            System.out.println("4.Média dos Elementos");
            System.out.println("5.Soma da Diagonal Principal");
            System.out.println("6.Quantidade de Pares");
            System.out.println("7.Procurar um Valor");
            System.out.println("8.Substituir matriz");
            System.out.println("9.Alterar valor numa posição da matriz");
            System.out.println("0.Sair");
            System.out.print("\nEscolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nMaior Elemento: "+maiorElemento(matriz));
                    break;
                case 2:
                    System.out.println("\nMenor Elemento: "+menorElemento(matriz));
                    break;
                case 3:
                    System.out.println("\nSomatório dos Elementos: "+somatorio(matriz));
                    break;
                case 4:
                    System.out.println("\nMédia dos Elementos: "+media(matriz));
                    break;
                case 5:
                    System.out.println("\nSoma da Diagonal Principal: "+somaDiagonalPrincipal(matriz));
                    break;
                case 6:
                    System.out.println("\nQuantidade de Num. Pares: "+contarPares(matriz));
                    break;
                case 7:
                    do {
                        System.out.print("\nIntroduza o valor: ");
                        valor = input.nextInt();
                        if (!existeValor(matriz, valor))
                            System.out.println("\nNão existe");
                        else
                            System.out.println("\nExiste");
                    }while (simNao());
                    break;
                case 8:
                    matriz = preencherMatriz(tamanho("linhas"),tamanho("colunas"));
                    break;
                case 9:
                    do {
                        System.out.print("\nIntroduza a linha: ");
                        linha = input.nextInt();
                        System.out.print("\nIntroduza a coluna: ");
                        coluna = input.nextInt();
                        if (linha< matriz.length && coluna< matriz[linha].length){
                            alterarValor(matriz, linha, coluna);
                            break;}
                        else System.out.println("\nErro");
                    }while (simNao());
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