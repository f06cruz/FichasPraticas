package FichaPratica07_extra.Ex11;

import java.util.Scanner;

public class B11 {

    /**
     * Escrever a matriz
     * @param matriz
     */
    public static void escreverMatriz(String[][] matriz){

        System.out.println();
        System.out.println("---Jogo---");
        for(int x = 0; x< 3; x++){
            for(int y = 0; y < 3; y++){
                if (matriz[x][y]==null)
                    System.out.print("-   ");
                else System.out.print(matriz[x][y]+"   ");
            }
            System.out.println();
        }
    }

    public static boolean verificar(int num){
        if (num >= 0 && num < 3)
            return true;
        else {System.out.println("\nErro");
            System.out.println("volte a tentar");}
        return false;
    }

    public static boolean verificar2(int linha,int coluna, String[][] jogo){
        if (jogo[linha][coluna]==null)
            return true;
        else {System.out.println("\nErro");
            System.out.println("Espaço ocupado");
            System.out.println("volte a tentar");}
        return false;
    }

    public static boolean resultado(int jog,String[][] jogo){
        int cont=0, conte=0;
        String simb;

        if (jog ==1)
            simb="X";
        else simb="O";

        for(int x = 0; x<3; x++) {
            for (int y = 0; y < 3; y++) {
                if (jogo[x][y]==simb && (x == y)) {
                    cont++;
                    if (cont == 3) {
                        if(simb=="X")
                            System.out.println("\nO jogador 1 ganhou!");
                        else System.out.println("\nO jogador 2 ganhou!");
                        return true;
                    }
                }
            }
        }
        cont =0;
        for(int x = 0; x<3; x++) {
            for (int y = 0; y < 3; y++) {
                if (jogo[x][y]==simb && (x-y==2||x-y==-2||(x==1&&y==1))) {
                    cont++;
                    if (cont == 3) {
                        if(simb=="X")
                            System.out.println("\nO jogador 1 ganhou!");
                        else System.out.println("\nO jogador 2 ganhou!");
                        return true;
                    }
                }
            }
        }
        cont =0;
        for(int x = 0; x<3; x++) {
            for (int y = 0; y < 3; y++) {
                if (jogo[x][y]==simb) {
                    cont++;}
            if (cont == 3) {
                    if(simb.equals("X"))
                        System.out.println("\nO jogador 1 ganhou!");
                    else System.out.println("\nO jogador 2 ganhou!");
                    return true;
                }
            cont =0;
            }
        }

        cont =0;
        for(int x = 0; x<3; x++) {
            for (int y = 0; y < 3; y++) {
                if (jogo[y][x]==simb) {
                    cont++;}
                if (cont == 3) {
                    if(simb.equals("X"))
                        System.out.println("\nO jogador 1 ganhou!");
                    else System.out.println("\nO jogador 2 ganhou!");
                    return true;
                }
                cont =0;
            }
        }
        for(int x = 0; x<3; x++) {
            for (int y = 0; y < 3; y++) {
                if (jogo[y][x] != null) {
                    conte++;
                    if (conte == 9) {
                        System.out.println("\nEmpate!");
                        return true;
                    }
                }
            }
        }

        return false;
    }


    public static String[][] jogador (int num, String[][] jogo) {
        Scanner input = new Scanner(System.in);
        int linha, coluna;

        System.out.println("\nJogador "+num);
        do {
            do {
                System.out.print("\nIntroduza a linha: ");
                linha = input.nextInt()-1;
            } while (!verificar(linha));
            do {
                System.out.print("\nIntroduza a coluna: ");
                coluna = input.nextInt()-1;
            } while (!verificar(coluna));
        } while (!verificar2(linha,coluna,jogo));
        if( num==1)
            jogo[linha][coluna]="X";
        else jogo[linha][coluna]="O";
        return jogo;
    }
}
