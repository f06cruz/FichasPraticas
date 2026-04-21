package FichaPratica06;

import java.util.Scanner;
import static FichaPratica06.BibliotecaConversoes.*;
import static FichaPratica06.Copyright.fecho;

public class ConversorUniversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n_________Assistente__________");

        int opcao, RespostaInt,RespostaUtilizador2;
        double RespostaDouble, RespostaUtilizador1;
        boolean respostaBoolean;
        String respostaString;


        do {
            System.out.println("\nOpções:");
            System.out.println("1.Temperaturas – Celsius p/ Fahrenheit");
            System.out.println("2.Temperaturas – Fahrenheit p/ Celsius");
            System.out.println("3.Sistema Métrico – Metros p/ Centímetros");
            System.out.println("4.Sistema Métrico – Centímetro p/ Metros");
            System.out.println("5.Moedas – EUR p/ outras Moedas");
            System.out.println("6.Tempo – Horas p/ Minutos");
            System.out.println("7.Tempo – Minutos p/ Horas");
            System.out.println("0.Sair");
            System.out.print("\nEscolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nIntroduza a temperatura em Celsius: ");
                    RespostaUtilizador1 =input.nextDouble();
                    RespostaDouble =celsiusParaFahrenheit(RespostaUtilizador1);
                    System.out.println("Fahrenheit: "+RespostaDouble);
                    break;
                case 2:
                    System.out.print("\nIntroduza a temperatura em Fahrenheit: ");
                    RespostaUtilizador1 =input.nextDouble();
                    RespostaDouble =fahrenheitParaCelsius(RespostaUtilizador1);
                    System.out.println("Celsius: "+RespostaDouble);
                    break;
                case 3:
                    System.out.print("\nIntroduza os metros: ");
                    RespostaUtilizador1 =input.nextDouble();
                    RespostaDouble =metrosParaCentimetros(RespostaUtilizador1);
                    System.out.println("Centimetros: "+RespostaDouble);
                    break;
                case 4:
                    System.out.print("\nIntroduza os centimetros: ");
                    RespostaUtilizador1 =input.nextDouble();
                    RespostaDouble =centimetrosParaMetros(RespostaUtilizador1);
                    System.out.println("Metros: "+RespostaDouble);
                    break;
                case 5:
                    System.out.print("\nIntroduza valor: ");
                    RespostaUtilizador1 =input.nextDouble();
                    System.out.println("Escolha uma moeda: ");
                    System.out.println("USD");
                    System.out.println("GBP");
                    System.out.println("BRL");
                    System.out.print("Moeda: ");
                    respostaString = input.next();
                    RespostaDouble =converterEuros(RespostaUtilizador1, respostaString);
                    if (RespostaDouble<=0)
                        System.out.println("\nErro");
                    else System.out.println("\nValor: "+ RespostaDouble);
                    break;
                case 6:
                    System.out.print("\nIntroduza as horas: ");
                    RespostaUtilizador2 =input.nextInt();
                    RespostaInt =horasParaMinutos(RespostaUtilizador2);
                    System.out.println("\nMinutos :"+ RespostaInt);
                    break;
                case 7:
                    System.out.print("\nIntroduza os minutos: ");
                    RespostaUtilizador2 =input.nextInt();
                    RespostaInt =minutosParaSegundos(RespostaUtilizador2);
                    System.out.println("\nSegundos :"+ RespostaInt);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Erro");
            }
        } while (opcao!=0);

        System.out.println("\nA fechar assistente...");
        fecho();

    }
}
