package FichaPratica06.Ex05;
import java.util.Scanner;

public class BibliotecaMatrizes {

    public static int tamanho(String posicao){
        Scanner input = new Scanner(System.in);
        int tamanho;

        System.out.print("\nIntroduza o valor das "+posicao+": ");
        tamanho= input.nextInt();
        System.out.println();

        return tamanho;
    }

    public static int [][] preencherMatriz(int linhas,int colunas){
        Scanner input = new Scanner(System.in);
        int [][] matriz =new int[linhas][colunas];

        for(int x = 0; x< linhas; x++){
            for(int y = 0; y < colunas; y++){
                System.out.print("Introduza o valor da posição linha "+ x +" coluna "+y+": ");
                matriz[x][y]= input.nextInt();}
        }

        return matriz;
    }

    public static int maiorElemento(int[][] matriz){
        int maior =matriz[0][0];

        for(int x = 0; x< matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                if (matriz[x][y]>maior)
                    maior = matriz[x][y];}
        }

        return maior;
    }

    public static int menorElemento(int[][] matriz){
        int menor =matriz[0][0];

        for(int x = 0; x< matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                if (matriz[x][y]< menor)
                    menor = matriz[x][y];}
        }

        return menor;
    }

    public static int somatorio(int[][] matriz){
        int soma =0;

        for(int x = 0; x< matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                    soma += matriz[x][y];}
        }

        return soma;
    }

    public static int media(int[][] matriz){
        int media =0;

        for(int x = 0; x< matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                media += matriz[x][y];}
        }

        media/= matriz.length;

        return media;
    }

    public static int somaDiagonalPrincipal(int[ ][ ] matriz) {
        int soma =0;

        for(int x = 0; x< matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                if (x==y)
                    soma += soma;}
        }

        return soma;
    }

    public static int contarPares(int[ ] vetor){
        int cont=0;

        for (int i=1;i< vetor.length;i++){
            if (vetor[i]%2==0&&vetor[i]!=1 && vetor[i]!=0)
                cont++;
        }

        return cont;
    }

    public static boolean existeValor(int[ ] vetor, int valor){
        boolean existe =false;

        for (int i=0;i< vetor.length;i++){
            if (vetor[i]==valor){
                existe =true;
                break;}
        }

        return existe;
    }


}
