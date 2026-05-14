package FichaPratica06_extra.Ex11;
import java.util.Scanner;
import static FichaPratica06_extra.Ex11.B11.*;
import static FichaPratica06_extra.funcoesExtra.*;

public class EX11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n_________Jogo do Galo__________");

        int numj=1;
        boolean resultado=false;

        do{
            String [][] jogo = new String[3][3];
            while(!resultado) {
                escreverMatriz(jogo);
                jogo = jogador(numj,jogo);
                escreverMatriz(jogo);
                if(resultado(numj,jogo))
                    break;
                numj++;
                jogo = jogador(numj,jogo);
                resultado(numj,jogo);
                numj--;
            }
        }while (simNao());
        terminar();
        fecho();
    }
}
