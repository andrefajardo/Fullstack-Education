// TODO: 19/01/2024  Calculadora de IMC (Índice de Massa Corporal)
//  Crie uma Classe Pessoa que terá os atributos nome, idade, altura e peso.
//  Adicione Scanners para receber os dados de pessoa após isso gerar o IMC.
//  Crie um método para calcular o IMC.
//  Solicite ao usuário para inserir peso, altura, nome e idade.
//  Chame o método para calcular o IMC.
//  Utilize estruturas de decisão para categorizar o IMC.
//  Exiba uma mensagem indicando o estado nutricional.

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("=====     Calculador IMC    =====");
        System.out.println("=================================");
        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Informe sua idade: ");
        Integer idade = entrada.nextInt();
        System.out.println("Informe sua altura (0,00m): ");
        Double altura = entrada.nextDouble();
        System.out.println("Informe sua peso (0,00kg): ");
        Double peso = entrada.nextDouble();
        Pessoa p1 = new Pessoa();
        Double IMC = p1.calculaIMC(nome, idade, altura, peso);
        System.out.println("===============================================");
        System.out.printf( "   %s, o valor do seu IMC é: %.2f \n", nome, IMC);
        System.out.printf("   Condição: %s\n", p1.verificaIMC(IMC));
        System.out.println("===============================================\n");

    }
}