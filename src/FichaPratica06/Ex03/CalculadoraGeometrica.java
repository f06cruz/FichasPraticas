package FichaPratica06.Ex03;
import java.util.Scanner;
import static FichaPratica06.Ex03.BibliotecaGeometrica.*;
import static FichaPratica06.funcoesExtra.*;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n_________Calculadora__________");

        int opcao;
        double num1,num2, resultado;


        do {
            System.out.println("\nOpções:");
            System.out.println("1.Área do Quadrado");
            System.out.println("2.Perímetro do Quadrado");
            System.out.println("3.Área do Retângulo");
            System.out.println("4.Perímetro do Retângulo");
            System.out.println("5.Área do Círculo");
            System.out.println("6.Circunferência");
            System.out.println("7.Área do Triângulo");
            System.out.println("0.Sair");
            System.out.print("\nEscolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nIntroduza o valor do lado: ");
                    num1 =input.nextDouble();
                    resultado =areaQuadrado(num1);
                    System.out.println("\nÁrea do Quadrado: "+ resultado);
                    break;
                case 2:
                    System.out.print("\nIntroduza o valor do lado: ");
                    num1 =input.nextDouble();
                    resultado =perimetroQuadrado(num1);
                    System.out.println("\nPerímetro do Quadrado: "+ resultado);
                    break;
                case 3:
                    System.out.print("\nIntroduza o valor da base: ");
                    num1 =input.nextDouble();
                    System.out.print("\nIntroduza o valor da altura: ");
                    num2 =input.nextDouble();
                    resultado =areaRetangulo(num1,num2);
                    System.out.println("\nÁrea do Retângulo: "+ resultado);
                    break;
                case 4:
                    System.out.print("\nIntroduza o valor da base: ");
                    num1 =input.nextDouble();
                    System.out.print("\nIntroduza o valor da altura: ");
                    num2 =input.nextDouble();
                    resultado =perimetroRetangulo(num1,num2);
                    System.out.println("\nPerímetro do Retângulo: "+ resultado);
                    break;
                case 5:
                    System.out.print("\nIntroduza o valor do raio: ");
                    num1 =input.nextDouble();
                    resultado =areaCirculo(num1);
                    System.out.println("\nÁrea do Círculo: "+ resultado);
                    break;
                case 6:
                    System.out.print("\nIntroduza o valor do raio: ");
                    num1 =input.nextDouble();
                    resultado =circunferencia(num1);
                    System.out.println("\nCircunferência: "+ resultado);
                    break;
                case 7:
                    System.out.print("\nIntroduza o valor da base: ");
                    num1 =input.nextDouble();
                    System.out.print("\nIntroduza o valor da altura: ");
                    num2 =input.nextDouble();
                    resultado =areaTriangulo(num1,num2);
                    System.out.println("\nÁrea do Triângulo: "+ resultado);
                    break;
                case 0:
                    terminar();
                    break;
                default:
                    System.out.println("\nErro");
            }
            if (opcao!=0)
                limparConsola();
        } while (opcao!=0);
        fecho();
    }
}