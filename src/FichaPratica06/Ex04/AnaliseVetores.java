package FichaPratica06.Ex04;
import java.util.Scanner;
import static FichaPratica06.Ex04.BibliotecaVetores.*;
import static FichaPratica06.funcoesExtra.*;

public class AnaliseVetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n_________Análise de Vetores__________");

        int opcao, valor;

        /*int [] vetor =new int[tamanhoVetor()];
        vetor=preencherVetor(vetor.length);
        ou */

        int [] vetor = preencherVetor(tamanhoVetor());

        do {
            escreverVetor(vetor);
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
                    System.out.println("\nMaior Elemento: "+maiorElemento(vetor) );
                    break;
                case 2:
                    System.out.println("\nMenor Elemento: "+ menorElemento(vetor));
                    break;
                case 3:
                    System.out.println("\nSomatório dos Elementos: "+somatorio(vetor));
                    break;
                case 4:
                    System.out.println("\nMédia dos Elementos: "+media(vetor));
                    break;
                case 5:
                    if (!crescente(vetor))
                        System.out.println("\nNão crescente");
                    else
                        System.out.println("\nCrescente");
                    break;
                case 6:
                    System.out.println("\nQuantidade de Num. Pares: "+contarPares(vetor));
                    break;
                case 7:
                    System.out.print("\nIntroduza o valor: ");
                    valor =input.nextInt();
                    if (!existeValor(vetor,valor))
                        System.out.println("\nNão existe");
                    else
                        System.out.println("\nExiste");
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