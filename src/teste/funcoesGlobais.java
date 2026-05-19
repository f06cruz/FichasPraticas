package teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcoesGlobais {

    /**
     *Função para pausar antes de primir Enter e "limpar" o ecrã depois.
     */
    public static void limparConsola(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------");
        System.out.println("\nPrima Enter para continuar");
        input.nextLine();
        for (int x=0;x<200;x++)
            System.out.println();
    }

    /**
     *Função para "limpar" o ecrã, sem precisar de primir Enter.
     */
    public static void terminar(){

        System.out.println("\n--------------------------");
        for (int x=0;x<200;x++)
            System.out.println();
    }

    /**
     *Serve para obter uma resposta sim ou não. Repete-se até obter uma resposta correcta.
     * @return Retorna true se escrito s/S e false se n/N.
     */
    public static boolean simNao() {
        Scanner input = new Scanner(System.in);
        String x;

        do{
            System.out.println("\n------------");
            System.out.println("\nRepetir? s/n");
            x=input.nextLine();
            if (x.equalsIgnoreCase("s") ) {
                return true;
            }
            else if (x.equalsIgnoreCase("n")) {
                break;
            }
            else System.out.println("\n!ERRO!");
        } while (!x.equalsIgnoreCase("s") || !x.equalsIgnoreCase("n"));
        return false;
    }

    /**
     * Verifica a existencia de uma determinada string numa especifica coluna de uma matriz.
     * @param matrizOriginal Matriz recebida, pode ser a matriz "bilhetes" ou a matriz "cartaz".
     * @param resposta String com o valor a para ser procurado, escrito pelo utilizador.
     * @param valor Serve para identificar a posição da coluna da matrizOriginal à qual a resposta vai ser comparada
     * @return Caso a string seja encontrada na matriz retorna true, senão false.
     */
    public static boolean verificar (String [][] matrizOriginal, String resposta, int valor){
        String [] matriz = new String[matrizOriginal.length];
        int cont=0;
        boolean teste;

        matriz[0]=matrizOriginal[0][valor];
        for (int x=0; x<matrizOriginal.length;x++){
            teste =false;
            for (int y = 0; y <=cont; y++) {
                if (matrizOriginal[x][valor].equals(matriz[y])) {
                    teste = false;
                    break;
                } else {
                    teste = true;
                }
            }
            if(teste){
                cont++;
                matriz[cont]=matrizOriginal[x][valor];
            }
        }
        for (int z = 0; z <=cont; z++) {
            if (matriz[z].equalsIgnoreCase(resposta))
                return true;
        }
        if (valor==6)
            System.out.println("\n!ERRO!\nTipo de bilhete não encontrado");
        if (valor==5)
            System.out.println("\n!ERRO!\nGénero não encontrado");
        return false;
    }

    /**
     *Serve para transformar um ficheiro numa matriz.
     * @param caminho Caminho do ficheiro em formato file.
     * @param delimitador Caractere que serve para separar os dados numa linha do ficheiro.
     * @param autorizacao Se for false a matriz não contém a primeira linha do ficheiro.
     * @return Retorna a matriz lida.
     * @throws FileNotFoundException
     */
    public static String [][] transformarFileMatriz(File caminho, String delimitador, boolean autorizacao) throws FileNotFoundException {
        Scanner ler = new Scanner(caminho);
        int cont=0;

        String[][] matriz = new String[linhas(caminho,autorizacao)][colunas(caminho,delimitador)];

        if(!autorizacao)
            ler.nextLine();
        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] array = linha.split(delimitador);
            for (int x = 0; x < matriz[0].length; x++)
                matriz[cont][x] = array[x];
            cont++;
        }
        return matriz;
    }

    /**
     *Serve para contar o número de linhas no ficheiro que vai ser transformado em matriz.
     * @param caminho Caminho do ficheiro em formato file.
     * @param autorizacao Se for false a matriz não contém a primeira linha do ficheiro.
     * @return Retorna o número de linhas do ficheiro, com ou sem a primeira conforme o valor da variável autorizacao.
     * @throws FileNotFoundException
     */
    public static int linhas(File caminho, boolean autorizacao) throws FileNotFoundException {
        Scanner ler = new Scanner(caminho);
        int linhas = 0;

        while (ler.hasNextLine()) {
            ler.nextLine();
            linhas++;
        }
        if (autorizacao)
            return (linhas);
        else return (linhas-1);
    }

    /**
     *Serve para contar o número de colunas no ficheiro que vai ser transformado em matriz, cada coluna será criada através do delimitador.
     * @param caminho Caminho do ficheiro em formato string.
     * @param delimitador Caractere que serve para separar os dados numa linha do ficheiro.
     * @return Retorna o número de colunas do ficheiro.
     * @throws FileNotFoundException
     */
    public static int colunas(File caminho, String delimitador) throws FileNotFoundException {
        Scanner ler = new Scanner(caminho);
        String[] array = ler.nextLine().split(delimitador);
        return array.length;
    }

}

