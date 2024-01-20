import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double num1;
        double num2;
        int escolha = 0;
        int op;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n--- CALCULADORA ---\n");
        while (escolha != 2) {
            System.out.println("Informe o 1º valor: ");
            num1 = entrada.nextDouble();
            System.out.println("Informe o 2º valor: ");
            num2 = entrada.nextDouble();
            System.out.println("Escolha o número da operação: ");
            System.out.println("1 ... Adição ");
            System.out.println("2 ... Subtração ");
            System.out.println("3 ... Multiplicação ");
            System.out.println("4 ... Divisão ");
            op = entrada.nextInt();
            Calculos.calculo(num1, num2, op);
            System.out.println("Gostaria de continuar? (1 - Sim | 2 - Não)");
            escolha = entrada.nextInt();
        }
    }
}