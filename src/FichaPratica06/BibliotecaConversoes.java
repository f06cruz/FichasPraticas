package FichaPratica06;

public class BibliotecaConversoes {

    // Celsius = (Fahrenheit - 32) / 1.8
    public static double celsiusParaFahrenheit(double celsius){

    }

    //Fahrenheit = (Celsius * 1.8) + 32
    public static double fahrenheitParaCelsius(double fahrenheit){

    }

    //1m=100cm
    public static double metrosParaCentimetros(double metros){

    }

    //1cm=0.01m
    public static double centimetrosParaMetros(double cm){

    }

    //1 EUR equivale a
    //1,18 usd
    //0,87 GBP
    //5,87 brl
    public static double converterEuros(double euros, String moedaDestino){
        double resposta;

        switch (moedaDestino){
            case "USD":
                resposta =euros*1.18;
                break;
            case "GBP":
                resposta =euros*0.87;
                break;
            case "BRL":
                resposta =euros*5.87;
                break;
            default: resposta =0;
        }
        return resposta;
    }

    //1h=60m
    public static int horasParaMinutos(int horas){

    }

    //1m=60s
    public static int  minutosParaSegundos(int minutos){

    }

}
