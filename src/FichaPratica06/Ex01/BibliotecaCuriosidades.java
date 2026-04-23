package FichaPratica06.Ex01;

public class BibliotecaCuriosidades {

    /**
     * Verificar se uma pessoa é maior de idade
     * @param idade
     * @return v/f
     */
    public static boolean maiorDeIdade(int idade){

    if (idade >= 18)
        return true;
    else return false;
}

    /**
     * Identificar a fase da vida
     * @param idade
     * @return string com nome fase
     */
    public static String faseVida(int idade){

    if (idade >=0 && idade<=12){
        return"Criança";}
    else if (idade>12 && idade<=17) {
        return"Adolescente";}
    else if (idade>17 && idade<=64) {
        return"Adulto";}
    else if (idade>64) {
        return"Idoso";}
    else return"Erro";
}


    /**
     * Mostrar a capital de um país
     * @param pais
     * @return string - capital
     */
    public static String capitalPais(String pais){

        //if(pais.equalsIgnoreCase()
    switch (pais.toLowerCase()){
        case "portugal":
            return "Lisboa";
        case "espanha":
            return "Madrid";
        case "frança":
            return "Paris";
        case "itália":
            return"Roma";
        case "alemanha":
            return"Berlim";
        default: return"País não encontrado";
    }
}

    /**
     * Indicar a estação do ano a partir do mês
     * @param mes em int
     * @return mes em extenso
     */
    public static String estacaoAno(int mes){

    if (mes==12 || mes==1 || mes==2){
        return "Inverno";}
    else if (mes==3 || mes==4 || mes==5){
        return "Primavera";}
    else if (mes==6 || mes==7 || mes==8){
        return "Verão";}
    else if (mes==9 || mes==10 || mes==11){
        return "Outono";}
    else return "Mês inválido";
}

    /**
     * Mostrar o dia da semana
     * @param dia em int
     * @return dia em extenso
     */
    public static String diaSemana(int dia) {
    String semana;

    switch (dia){
        case 1:
            return "Segunda-feira";
        case 2:
            return "Terça-feira";
        case 3:
            return "Quarta-feira";
        case 4:
            return "Quinta-feira";
        case 5:
            return "Sexta-feira";
        case 6:
            return "Sábado";
        case 7:
            return "Domingo";
        default: return "dia inválido";
    }
}

    /**
     * Classificar um número positivo ou negativo
     * @param num
     * @return
     */
    public static String tipoNumero(int num){

    if (num>0)
        return "Positivo";
    else if (num<0) {
        return "Negativo";
    }
    else return "Zero";
}

}


