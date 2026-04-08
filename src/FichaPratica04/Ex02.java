package FichaPratica04;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________FP04 | EX02__________");

        int opcao;


        do {
            System.out.println("\n");
            System.out.println("Opções:");
            System.out.println("1.Criar");
            System.out.println("2.Atualizar");
            System.out.println("3.Eliminar");
            System.out.println("4.Sair");
            System.out.print("\nEscolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nCriar");
                    break;
                case 2:
                    System.out.println("\nAtualizar");
                    break;
                case 3:
                    System.out.println("\nEliminar");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nErro");
            }
        }while (opcao!=4);

    }
}