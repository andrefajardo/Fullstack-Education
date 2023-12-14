// TODO: Desenvolva um programa para calcular a quantidade de salários mínimos.
//  Sabendo que o salário mínimo hoje é R$1.212,00, o usuário deverá informar
//  seu salário e o seu algoritmo deverá informar quantos salários ele recebe.
//  Ex: Você recebe 1 mínimo.

package salarios;
import java.util.Scanner;
public class salarios {
    public static void main(String[] args) {

        double salarioMinimo = 1212.00;
        Scanner salario = new Scanner(System.in);
        System.out.print("Informe o valor do salário: ");
        double valorSalario = salario.nextDouble();
        double qtdSalarios = valorSalario/salarioMinimo;
        System.out.println("O valor corresponde a " + qtdSalarios + " salários mínimos.");
    }
}
