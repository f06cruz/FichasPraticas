package FichaPratica07.Ex09;

public class B09 {

    public static void genero(String[][] matriz,String genero) {
        boolean cont=false;
        for(int x=0;x<matriz.length;x++){
            if (matriz[x][2].equalsIgnoreCase(genero)) {
                System.out.print(matriz[x][0]+" || "+matriz[x][1]);
                System.out.println();
                cont=true;
            }
        }
        if(!cont)
            System.out.println("\nNão existem músicas com o género escolhido.");
    }

    public static void artista(String[][] matriz,String artista) {
        boolean cont=false;
        for(int x=0;x<matriz.length;x++){
            if (matriz[x][1].equalsIgnoreCase(artista)) {
                System.out.print(matriz[x][0]+" || "+matriz[x][1]);
                System.out.println();
                cont=true;
            }
        }
        if(!cont)
            System.out.println("\nNão existem músicas do artista escolhido.");
    }

    public static void maior(String[][] matriz) {
        int tMusica =0,temp1=0;

        for (int linha =0;linha<matriz.length;linha++) {
            String [] duracaoV=matriz[linha][3].split(":");
            if (tMusica <Integer.parseInt(duracaoV[0])*60+Integer.parseInt(duracaoV[1])) {
                tMusica = Integer.parseInt(duracaoV[0]) * 60 + Integer.parseInt(duracaoV[1]);
                temp1 = linha;
            }
        }
        System.out.println("\nA música com maior tempo é "+matriz[temp1][0]+" de "+matriz[temp1][1]+" com o tempo de "+matriz[temp1][3]);
    }

    public static void acimaDuracao(String[][] matriz,int minutos, int segundos) {
        int tTotal;
        boolean cont = false;

        tTotal = minutos * 60 + segundos;

        for (int linha = 0; linha < matriz.length; linha++) {
            String[] duracaoV = matriz[linha][3].split(":");
            if (tTotal < Integer.parseInt(duracaoV[0]) * 60 + Integer.parseInt(duracaoV[1])) {
                System.out.println(matriz[linha][0] + " de " + matriz[linha][1] + " com o tempo de " + matriz[linha][3]);
                cont = true;
            }
        }
        if (!cont)
            System.out.println("\nNão existem músicas maiores que o tempo escolhido.");
    }

}
