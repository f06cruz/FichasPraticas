package FichaPratica06.Ex04;
import java.util.Scanner;
import static FichaPratica06.Ex04.BibliotecaVetores.*;
import static FichaPratica06.funcoesVoid.*;

public class AnaliseVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n_________Análise__________");

        int opcao,tamanho, valor, resultado;
        boolean resultadoBoolean;

        tamanho= tamanhoVetor();

        int [] vetor =new int[tamanho];

        vetor=preencherVetor(tamanho);

        do {
            resultadoBoolean=false;
            System.out.println("\nOpções:");
            System.out.println("1.Maior Elemento");
            System.out.println("2.Menor Elemento");
            System.out.println("3.Somatório dos Elementos");
            System.out.println("4.Média dos Elementos");
            System.out.println("5.Crescente ou Não Crescente");
            System.out.println("6.Quantidade de Pares");
            System.out.println("7.Procurar um Valor");
            System.out.println("0.Sair");
            System.out.print("\nEscolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    resultado =maiorElemento(vetor);
                    System.out.println("\nMaior Elemento: "+ resultado);
                    break;
                case 2:
                    resultado =menorElemento(vetor);
                    System.out.println("\nMenor Elemento: "+ resultado);
                    break;
                case 3:
                    resultado =somatorio(vetor);
                    System.out.println("\nSomatório dos Elementos: "+ resultado);
                    break;
                case 4:
                    resultado =media(vetor);
                    System.out.println("\nMédia dos Elementos: "+ resultado);
                    break;
                case 5:
                    resultadoBoolean =crescente(vetor);
                    if (!resultadoBoolean)
                        System.out.println("\nNão crescente");
                    else
                        System.out.println("\nCrescente");
                    break;
                case 6:
                    resultado =contarPares(vetor);
                    System.out.println("\nQuantidade de Pares: "+ resultado);
                    break;
                case 7:
                    System.out.print("\nIntroduza o valor: ");
                    valor =input.nextInt();
                    resultadoBoolean =existeValor(vetor,valor);
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