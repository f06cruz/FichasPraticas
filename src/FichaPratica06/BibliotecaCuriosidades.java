package FichaPratica06;

public class BibliotecaCuriosidades {

public static boolean maiorDeIdade(int idade){
    boolean maior;

    if (idade >= 18)
        maior=true;
    else maior=false;

    return maior;
}

public static String faseVida(int idade){
    String fase;

    if (idade >=0 && idade<=12){
        fase="Criança";}
    else if (idade>12 && idade<=17) {
        fase="Adolescente";}
    else if (idade>17 && idade<=64) {
        fase="Adulto";}
    else if (idade>64) {
        fase="Idoso";}
    else fase="Erro";

    return fase;
}

public static String capitalPais(String pais){
    String capital;

    switch (pais){
        case "Portugal":
            capital="Lisboa";
            break;
        case "Espanha":
            capital="Madrid";
            break;
        case "França":
            capital="Paris";
            break;
        case "Itália":
            capital="Roma";
            break;
        case "Alemanha":
            capital="Berlim";
            break;
        default: capital="País não encontrado";
    }
    return capital;
}

public static String estacaoAno(int mes){
    String estacao;

    if (mes==12 || mes==1 || mes==2){
        estacao="Inverno";}
    else if (mes==3 || mes==4 || mes==5){
        estacao="Primavera";}
    else if (mes==6 || mes==7 || mes==8){
        estacao="Verão";}
    else if (mes==9 || mes==10 || mes==11){
        estacao="Outono";}
    else estacao="Mês inválido";
    return estacao;
}

public static String diaSemana(int dia) {
    String semana;

    switch (dia){
        case 1:
            semana="Segunda-feira";
            break;
        case 2:
            semana="Terça-feira";
            break;
        case 3:
            semana="Quarta-feira";
            break;
        case 4:
            semana="Quinta-feira";
            break;
        case 5:
            semana="Sexta-feira";
            break;
        case 6:
            semana="Sábado";
            break;
        case 7:
            semana="Domingo";
            break;
        default: semana="dia inválido";
    }
    return semana;
}

public static String tipoNumero(int num){
    String resposta;

    if (num>0)
        resposta="Positivo";
    else if (num<0) {
        resposta="Negativo";
    }
    else resposta="Zero";
    return resposta;
}

}


