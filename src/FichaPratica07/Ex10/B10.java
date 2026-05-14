package FichaPratica07.Ex10;

public class B10 {

    public static void imprimir2(String[][] matriz,String matricula){
        boolean existe=false;

        for (int x = 0; x < matriz.length; x++) {
            if (matriz[x][1].equalsIgnoreCase(matricula)) {
                System.out.println();
                for (int y = 0; y < matriz[0].length-1; y++) {
                    System.out.print(matriz[x][y] + "||");
                }
                System.out.print(matriz[x][matriz[x].length-1]);
                existe=true;
            }
        }
        if (!existe)
            System.out.println("O aluno não existe");
    }

    public static void imprimir3(String[][] matriz, String curso){
        boolean existe=false;
        int cont=0;

        for (int x = 0; x < matriz.length; x++) {
            if (matriz[x][2].equalsIgnoreCase(curso)) {
                System.out.println();
                for (int y = 0; y < matriz[0].length-1; y++) {
                    System.out.print(matriz[x][y] + "||");
                }
                System.out.print(matriz[x][matriz[x].length-1]);
                existe=true;
                cont++;
            }
        }

        if (!existe)
            System.out.println("\nO curso não existe");
        else System.out.println("\n\nO curso tem "+cont+" alunos.");
    }

    public static void imprimir4(String[][] matriz){
        int idade=0, temp=0;

        for (int x = 0; x < matriz.length; x++) {
            if (idade<Integer.parseInt(matriz[x][4])) {
                idade=Integer.parseInt(matriz[x][4]);
                temp=x;
            }
        }
        for (int y = 0; y < matriz[0].length-1; y++) {
            System.out.print(matriz[temp][y] + "||");
        }
        System.out.print(matriz[temp][matriz[temp].length-1]);
    }

    public static void imprimir5(String[][] matriz){
        int cont1=0, cont2=0;

        for (int linha1 = 0; linha1 < matriz.length; linha1++) {
            for (int linha2 = 0; linha2 < matriz.length; linha2++) {
            }
        }

        for (int x = 0; x < matriz.length; x++) {
            if (matriz[x][2].equalsIgnoreCase("x")) {
                System.out.println();
                for (int y = 0; y < matriz[0].length-1; y++) {
                    System.out.print(matriz[x][y] + "||");
                }
                System.out.print(matriz[x][matriz[x].length-1]);
            }
        }
    }
}
