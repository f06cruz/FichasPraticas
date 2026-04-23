package FichaPratica06.Ex2;

import java.util.Scanner;
import static FichaPratica06.Ex2.BibliotecaConversoes.*;
import static FichaPratica06.funcoesVoid.*;

public class ConversorUniversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n_________Conversor__________");

        int opcao, RespostaInt,RespostaUtilizador2;
        double RespostaDouble, RespostaUtilizador1;
        String respostaString;


        do {
            System.out.println("\nOpções:");
            System.out.println("1.Temperaturas – Celsius p/ Fahrenheit");
            System.out.println("2.Temperaturas – Fahrenheit p/ Celsius");
            System.out.println("3.Sistema Métrico – Metros p/ Centímetros");
            System.out.println("4.Sistema Métrico – Centímetro p/ Metros");
            System.out.println("5.Moedas – EUR p/ outras Moedas");
            System.out.println("6.Tempo – Horas p/ Minutos");
            System.out.println("7.Tempo – Minutos p/ Segundos");
            System.out.println("0.Sair");
            System.out.print("\nEscolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nIntroduza a temperatura em Celsius: ");
                    RespostaUtilizador1 =input.nextDouble();
                    RespostaDouble =celsiusParaFahrenheit(RespostaUtilizador1);
                    System.out.println("\nFahrenheit: "+RespostaDouble+"F");
                    break;
                case 2:
                    System.out.print("\nIntroduza a temperatura em Fahrenheit: ");
                    RespostaUtilizador1 =input.nextDouble();
                    RespostaDouble =fahrenheitParaCelsius(RespostaUtilizador1);
                    System.out.println("\nCelsius: "+RespostaDouble+"C");
                    break;
                case 3:
                    System.out.print("\nIntroduza os metros: ");
                    RespostaUtilizador1 =input.nextDouble();
                    RespostaDouble =metrosParaCentimetros(RespostaUtilizador1);
                    System.out.println("\nCentimetros: "+RespostaDouble+"cm");
                    break;
                case 4:
                    System.out.print("\nIntroduza os centimetros: ");
                    RespostaUtilizador1 =input.nextDouble();
                    RespostaDouble =centimetrosParaMetros(RespostaUtilizador1);
                    System.out.println("\nMetros: "+RespostaDouble+"m");
                    break;
                case 5:
                    System.out.print("\nIntroduza valor: ");
                    RespostaUtilizador1 =input.nextDouble();
                    System.out.println("\nEscolha uma moeda: ");
                    System.out.println("USD");
                    System.out.println("GBP");
                    System.out.println("BRL");
                    System.out.print("Moeda: ");
                    respostaString = input.next();
                    RespostaDouble =converterEuros(RespostaUtilizador1, respostaString);
                    if (RespostaDouble<=0)
                        System.out.println("\nErro");
                    else {
                        switch (respostaString){
                            case "USD":
                                System.out.println("\nValor: "+ RespostaDouble+"$");
                                break;
                            case "GBP":
                                System.out.println("\nValor: "+ RespostaDouble+"£");
                                break;
                            case "BRL":
                                System.out.println("\nValor: "+ RespostaDouble+"R$");
                                break;
                        }
                    }
                    break;
                case 6:
                    System.out.print("\nIntroduza as horas: ");
                    RespostaUtilizador2 =input.nextInt();
                    RespostaInt =horasParaMinutos(RespostaUtilizador2);
                    System.out.println("\nMinutos: "+ RespostaInt+"min");
                    break;
                case 7:
                    System.out.print("\nIntroduza os minutos: ");
                    RespostaUtilizador2 =input.nextInt();
                    RespostaInt =minutosParaSegundos(RespostaUtilizador2);
                    System.out.println("\nSegundos: "+ RespostaInt+"s");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nErro");
            }
            if (opcao!=0)
                limparConsola();
        } while (opcao!=0);

        System.out.println("\nA fechar assistente...");
        fecho();

    }
}
