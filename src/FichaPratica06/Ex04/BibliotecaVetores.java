package FichaPratica06.Ex04;
import java.util.Scanner;

public class BibliotecaVetores {

    public static int tamanhoVetor(){
        Scanner input = new Scanner(System.in);
        int tamanho;

        System.out.print("\nIntroduza o tamanho do vetor: ");
        tamanho= input.nextInt();
        System.out.println();

        return tamanho;
    }

    public static int [] preencherVetor(int tamanho){
        Scanner input = new Scanner(System.in);
        int [] vetor =new int[tamanho];

        for(int x=0; x<tamanho;x++){
            System.out.print("Introduza o valor da posição "+x+": ");
            vetor[x]= input.nextInt();
        }

        return vetor;
    }

    public static int maiorElemento(int[ ] vetor){
        int maior =vetor[0];

        for (int i=0;i< vetor.length;i++){
            if (vetor[i]>maior)
                maior = vetor[i];
        }

        return maior;
    }

    public static int menorElemento(int[ ] vetor){
        int menor =vetor[0];

        for (int i=0;i< vetor.length;i++){
            if (vetor[i]<menor)
                menor = vetor[i];
        }

        return menor;
    }

    public static int somatorio(int[ ] vetor){
        int soma =0;

        for (int i=0;i< vetor.length;i++){
            soma += vetor[i];
        }

        return soma;
    }

    public static int media(int[ ] vetor){
        int media =0;

        for (int i=0;i< vetor.length;i++){
            media += vetor[i];
        }

        media/=vetor.length;

        return media;
    }

    public static boolean crescente(int[ ] vetor){
        boolean cres=true;

        for (int i=1;i< vetor.length;i++){
            if (vetor[i]<vetor[i-1])
                cres = false;
        }

        return cres;
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
