package FichaPratica06.Ex02;

public class BibliotecaConversoes {

    /**
     * Temperaturas – Celsius p/ Fahrenheit
     * @param celsius
     * @return fahrenheit
     */
    // Fahrenheit = (Celsius * 1.8) + 32
    public static double celsiusParaFahrenheit(double celsius){

        return celsius*1.8+32;
    }

    /**
     * Temperaturas – Fahrenheit p/ Celsius
     * @param fahrenheit
     * @return celcius
     */
    // Celsius = (Fahrenheit - 32) / 1.8
    public static double fahrenheitParaCelsius(double fahrenheit){

        return (fahrenheit-32)/1.8;
    }

    /**
     * Sistema Métrico – Metros p/ Centímetros
     * @param metros
     * @return cm
     */
    //1m=100cm
    public static double metrosParaCentimetros(double metros){

        return metros*100;
    }

    /**
     * Sistema Métrico – Centímetro p/ Metros
     * @param cm
     * @return metros
     */
    //1cm=0.01m
    public static double centimetrosParaMetros(double cm){

        return cm*0.01;
    }

    /**
     * Moedas – EUR p/ outras Moedas
     * @param euros
     * @param moedaDestino
     * @return valor moeda selecionada
     */
    //1 EUR equivale a
    //1,18 usd
    //0,87 GBP
    //5,87 brl
    public static double converterEuros(double euros, String moedaDestino){

        switch (moedaDestino.toLowerCase()){
            case "usd":
                return euros*1.18;
            case "gbp":
                return euros*0.87;
            case "brl":
                return euros*5.87;
            default: return 0;
        }
    }

    /**
     * Tempo – Horas p/ Minutos
     * @param horas
     * @return minutos
     */
    //1h=60m
    public static int horasParaMinutos(int horas){

        return horas*60;
    }

    /**
     * Tempo – Minutos p/ Segundos
     * @param minutos
     * @return segundos
     */
    //1m=60s
    public static int  minutosParaSegundos(int minutos){

        return minutos*60;
    }

}
