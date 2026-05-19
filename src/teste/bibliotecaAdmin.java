package teste;

import static teste.funcoesGlobais.*;

public class bibliotecaAdmin {

    /**
     *Verifica a existencia do festivaleiro na matris bilhetes através do idFes introduzido pelo utilizador. Caso exista imprime os dados do mesmo. Caso não exista imprime uma mensagem de erro.
     * @param bilhetes Matriz bilhetes obtida do Menu Administrador.
     * @param idFes ID do festivaleiro introduzido pelo utilizador na função anterior.
     * @return Retorna true caso o festivaleiro exista ou false em caso contrário.
     */
    public static boolean festivaleiro(String [][] bilhetes, String idFes){
        for (int linha = 0; linha < bilhetes.length; linha++) {
            if (bilhetes[linha][1].equals(idFes)) {
                System.out.println("\n_________FESTIVALEIRO ENCONTRADO_________\n");
                System.out.println("Nome: "+bilhetes[linha][2]);
                System.out.println("Contacto: "+bilhetes[linha][3]);
                System.out.println("Email: "+bilhetes[linha][4]);
                return true;
            }
        }
        System.out.println("\n_________FESTIVALEIRO NÃO ENCONTRADO_________");
        return false;
    }

    /**
     * Imprime todos os bilhetes comprados por um festivaleiro, fornecido pelo utilizador, e o respectivo total.
     * @param bilhetes Matriz bilhetes obtida do Menu Administrador.
     * @param idFes ID do festivaleiro introduzido pelo utilizador na função anterior.
     */
    public static void imprimirBilhetes(String [][] bilhetes, String idFes){
        String nome="";
        double total=0;

        for (int linha = 0; linha < bilhetes.length; linha++) {
            if (bilhetes[linha][1].equals(idFes)) {
                nome = bilhetes[linha][2];
                break;
            }
        }
        System.out.println("\nBilhetes:");
        for (int linha = 0; linha < bilhetes.length; linha++) {
            if (bilhetes[linha][2].equals(nome)) {
                System.out.println("-"+bilhetes[linha][0]+" | "+bilhetes[linha][5]+" | "+bilhetes[linha][6]+" | "+bilhetes[linha][7]);
                total+=Double.parseDouble(bilhetes[linha][7]);
            }
        }
        total= (double) Math.round(total * 100) /100;
        System.out.println("\nTotal gasto: "+total+"€");
    }

    /**
     *A função procura o festivaleiro que tenha gasto o maior valor usa as funções festivaleiro e imprimirBilhetes para imprimir os respectivos dados.
     * @param bilhetes Matriz bilhetes obtida do Menu Administrador.
     */
    public static void melhorFes(String [][] bilhetes) {
        double maior=0,total;
        String idFes="";
        int lin=0, cont=0;
        boolean teste;
        String [] nomes= new String [bilhetes.length];

        //maior valor total de bilhetes por festivaleiro
        for (int x = 0; x < bilhetes.length; x++) {
            total = 0;
            for (int y = 0; y < bilhetes.length; y++) {
                if (bilhetes[y][2].equals(bilhetes[x][2])) {
                    total += Double.parseDouble(bilhetes[y][7]);
                }
            }
            if (total > maior) {
                maior = total;
                lin=x;
            }
        }
        // verificar se mais algum festivaleiro tem um valor igual de bilhetes e adicionar ao array
        nomes[0]=bilhetes[lin][2];
        for (int x=0; x<bilhetes.length;x++){
            teste =false;
            total = 0;
            for (int y = 0; y < bilhetes.length; y++) {
                if (bilhetes[y][2].equals(bilhetes[x][2])) {
                    total += Double.parseDouble(bilhetes[y][7]);
                }
            }
            for (int z = 0; z <=cont; z++) {
                if (bilhetes[x][2].equals(nomes[z])||total!=maior) {
                    teste = false;
                    break;
                } else {
                    teste = true;
                }
            }
            if(teste){
                cont++;
                nomes[cont]=bilhetes[x][2];
            }
        }
        //imprime todos os lugares ocupados do array
        System.out.println("_________MELHOR FESTIVALEIRO_________\n");
        for (int x = 0; x <= cont; x++) {
            for (int y = 0; y < bilhetes.length; y++) {
                if (nomes[x].equals(bilhetes[y][2])) {
                    idFes= bilhetes[y][1];
                    break;
                }
            }
            festivaleiro(bilhetes, idFes);
            imprimirBilhetes(bilhetes, idFes);
        }
        limparConsola();
    }
}
