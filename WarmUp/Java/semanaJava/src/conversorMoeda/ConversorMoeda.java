package conversorMoeda;

import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {

        Scanner conversor = new Scanner(System.in);
        System.out.println("Informe o valor a converter: ");
        Double vValor = conversor.nextDouble();
        System.out.println("Informe a moeda para onde converter: ");
        String vMoeda = conversor.next();

        switch (vMoeda) {
            case "UK":
                System.out.println("O valor em libras é: " + (vValor * 1.2681));
                break;
            case "USD":
                System.out.println("O valor em dolar americano é: " + (vValor * 0.2025));
                break;
            case "EUR":
                System.out.println("O valor em euros é: " + (vValor * 0.1860));
                break;
            case "ARG":
                System.out.println("O valor em peso argentino é: " + (vValor * 161));
                break;
            default:
                System.out.println("Informação inválida!");
        }

    }
}

//     EXERCÍCIOS 07
//          João está planejando um mochilão. Seus destinos são: EUA, Inglaterra,
//          França e planeja concluir na Argentina. Ele gostaria de um conversor de
//          moedas para saber quanto o valor em Real vale em cada moeda. Implemente
//          um conversor de moedas onde o usuário entrará com um valor em real,
//          selecionará para qual moeda deseja fazer a conversão e o sistema irá
//          retornar o valor na moeda selecionada.