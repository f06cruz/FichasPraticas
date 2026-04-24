package FichaPratica06.Ex05;
import java.util.Scanner;

public class BibliotecaMatrizes {

    /**
     * Defenir tamanho matriz, correr 2x
     * @param posicao
     * @return
     */
    public static int tamanho(String posicao){
        Scanner input = new Scanner(System.in);
        int tamanho;

        System.out.print("\nIntroduza o número de "+posicao+": ");
        tamanho= input.nextInt();

        return tamanho;
    }

    /**
     * Preencher a matriz
     * @param linhas
     * @param colunas
     * @return
     */
    public static int [][] preencherMatriz(int linhas,int colunas){
        Scanner input = new Scanner(System.in);
        int [][] matriz =new int[linhas][colunas];

        System.out.println();
        for(int x = 0; x< linhas; x++){
            for(int y = 0; y < colunas; y++){
                System.out.print("Introduza o valor da posição linha "+ x +" coluna "+y+": ");
                matriz[x][y]= input.nextInt();}
        }

        return matriz;
    }

    /**
     * Escrever a matriz
     * @param matriz
     */
    public static void escreverMatriz(int[][] matriz){

        System.out.println();
        System.out.println("---Matriz---");
        for(int x = 0; x< matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println();
        }
    }

    /**
     * encontrar o maior elemento da matriz
     * @param matriz
     * @return
     */
    public static int maiorElemento(int[][] matriz){
        int maior =matriz[0][0];

        for(int x = 0; x< matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                if (matriz[x][y]>maior)
                    maior = matriz[x][y];}
        }

        return maior;
    }

    /**
     * encontrar o menor elemento da matriz
     * @param matriz
     * @return
     */
    public static int menorElemento(int[][] matriz){
        int menor =matriz[0][0];

        for(int x = 0; x< matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                if (matriz[x][y]< menor)
                    menor = matriz[x][y];}
        }

        return menor;
    }

    /**
     * somatório dos valores da matriz
     * @param matriz
     * @return
     */
    public static int somatorio(int[][] matriz){
        int soma =0;

        for(int x = 0; x< matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                    soma += matriz[x][y];}
        }

        return soma;
    }

    /**
     * média dos valores da matriz
     * @param matriz
     * @return
     */
    public static int media(int[][] matriz){
        int media;

       media= somatorio(matriz)/(matriz.length*matriz[0].length);

        return media;
    }

    /**
     * somatório dos valores na diagonal principal da matriz
     * @param matriz
     * @return
     */
    public static int somaDiagonalPrincipal(int[ ][ ] matriz) {
        int soma =0;

        for(int x = 0; x< matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                if (x==y)
                    soma += matriz[x][y];}
        }

        return soma;
    }

    /**
     * contar on num. de valores pares da matriz
     * @param matriz
     * @return
     */
    public static int contarPares(int[ ][ ] matriz){
        int cont=0;

        for(int x = 0; x< matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] % 2 == 0 && matriz[x][y] != 1 && matriz[x][y] != 0)
                    cont++;
            }
        }

        return cont;
    }

    /**
     * verificar se o valor introduzido pelo utilizador existe na matriz
     * @param matriz
     * @param valor
     * @return
     */
    public static boolean existeValor(int[ ][ ] matriz, int valor) {

        for(int x = 0; x< matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] == valor) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void alterarValor(int[ ][ ] matriz, int linha,int coluna) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nIntroduza o novo valor: ");
        matriz[linha][coluna]=input.nextInt();

    }


}
