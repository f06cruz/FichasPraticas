package FichaPratica06.Ex04;
import java.util.Scanner;

public class BibliotecaVetores {

    /**
     * Defenir tamanho do vetor
     * @return
     */
    public static int tamanhoVetor(){
        Scanner input = new Scanner(System.in);
        int tamanho;

        System.out.print("\nIntroduza o tamanho do vetor: ");
        tamanho= input.nextInt();
        System.out.println();

        return tamanho;
    }

    /**
     * Preencher vetor
     * @param tamanho
     * @return
     */
    public static int [] preencherVetor(int tamanho){
        Scanner input = new Scanner(System.in);
        int [] vetor =new int[tamanho];

        for(int x=0; x<tamanho;x++){
            System.out.print("Introduza o valor da posição "+x+": ");
            vetor[x]= input.nextInt();
        }

        return vetor;
    }

    /**
     * Escrever vetor
     * @param vetor
     */
    public static void escreverVetor(int[] vetor){

        System.out.println();
        System.out.println("---Vetor---");
        for(int x = 0; x< vetor.length; x++){
                System.out.print(vetor[x]+" ");
            }
            System.out.println();
    }

    /**
     * encontrar o maior elemento do vetor
     * @param vetor
     * @return
     */
    public static int maiorElemento(int[ ] vetor){
        int maior =vetor[0];

        for (int i=0;i< vetor.length;i++){
            if (vetor[i]>maior)
                maior = vetor[i];
        }

        return maior;
    }

    /**
     * encontrar o menor elemento do vetor
     * @param vetor
     * @return
     */
    public static int menorElemento(int[ ] vetor){
        int menor =vetor[0];

        for (int i=0;i< vetor.length;i++){
            if (vetor[i]<menor)
                menor = vetor[i];
        }

        return menor;
    }

    /**
     * soma dos valores do vetor
     * @param vetor
     * @return
     */
    public static int somatorio(int[ ] vetor){
        int soma =0;

        for (int i=0;i< vetor.length;i++){
            soma += vetor[i];
        }

        return soma;
    }

    /**
     * media dos valores do vetor
     * @param vetor
     * @return
     */
    public static int media(int[ ] vetor){
        int media;

        media= somatorio(vetor) /vetor.length;

        return media;
    }

    /**
     * verificar se os valores do vetor estão por ordem crescente
     * @param vetor
     * @return
     */
    public static boolean crescente(int[ ] vetor){

        for (int i=1;i< vetor.length;i++){
            if (vetor[i]<vetor[i-1])
                return false;
        }

        return false;
    }

    /**
     * contar num. valores pares do vetor
     * @param vetor
     * @return
     */
    public static int contarPares(int[ ] vetor){
        int cont=0;

        for (int i=0;i< vetor.length;i++){
            if (vetor[i]%2==0&&vetor[i]!=1 && vetor[i]!=0)
                cont++;
        }

        return cont;
    }

    /**
     * verificar se o valor introduzido pelo utilizador existe no vetor
     * @param vetor
     * @param valor
     * @return
     */
    public static boolean existeValor(int[ ] vetor, int valor){

        for (int i=0;i< vetor.length;i++){
            if (vetor[i]==valor){
                return true;
            }
        }

        return false;
    }


}
