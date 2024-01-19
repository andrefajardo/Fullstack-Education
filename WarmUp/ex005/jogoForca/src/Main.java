// TODO: 17/01/2024 Jogo da Forca:
//      Escolha palavras aleatórias e oculte-as.
//      Permita ao jogador fazer uma tentativa.
//      Revele as letras corretas nas posições corretas.
//      Adicione a lógica para limitar o número de tentativas.
//      Exiba uma mensagem de vitória ou derrota.
//      Implemente a opção de jogar novamente.

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        int limite = 5;
        int escolha = rand.nextInt(limite);
        System.out.println(escolha);
        String[] palavras = new String[5];
        for (int c=0; c<5; c++) {
            Scanner entrada = new Scanner(System.in);
            System.out.printf("Informe a %dª palavra da forca: \n", c+1);
            palavras[c] = entrada.nextLine();
        }
        Palavra forca = new Palavra();
        String[] resposta = forca.forca(palavras[escolha]);
        int tamanho = resposta.length;
        System.out.println("\n----- DESCUBRA A PALAVRA COM 5 TENTATIVAS -----\n");
        for (int c=0; c<5; c++ ) {
            Scanner entrada = new Scanner(System.in);
            System.out.printf("\n----- %dª TENTIVA -----\n", (c + 1));
            System.out.println("Escolha uma letra: ");
            String letra = entrada.nextLine();
            int found = 0;
            for (int l=0; l<tamanho; l++) {
                if (letra.equals(resposta[l])) {
                    System.out.println(resposta[l]);
                    System.out.printf("\nLetra encontrada na posição %d.\n", l+1);
                    found++;
                }
            }
            if (found == 0) {
                System.out.println("\nA palavra não contem essa letra.\n");
            }
        }
        String res;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n----- REVELE A PALAVRA -----\n");
        res = entrada.nextLine();
        String[] palavra = res.split("");
        if (Arrays.equals(palavra, resposta))
            System.out.println("ACERTOU!");
        else
            System.out.println("ERROU!");
    }
}