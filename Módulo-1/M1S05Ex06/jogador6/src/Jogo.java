import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// TODO: 09/02/2024
//  Crie a Classe Jogo, essa classe vai ter o jogo em si, o jogo consiste
//  em um pedra papel e tesoura, que o jogador deve inserir a sua jogada e
//  o sistema irá retornar se ele ganhou ou não.
//  O Jogo deve estar em um método jogar().
//  O Jogo deve ter o atributo, melhor jogador(melhorJogador) e deve ter o
//  número de vezes que o jogo foi jogado (numeroJogadas).
//  Cada vez que um jogador ganha ele deve receber mais um ponto, cada
//  tentativa adiciona ao numero de tentativas.
public class Jogo {
    Random rand = new Random();
    private int limite = 3;
    private int escolhaComp = rand.nextInt(limite) +1;
    private static String melhorJogador;
    private static int numeroJogadas = 0;
    private static int getNumeroJogadas = 0;

    public static int getNumeroJogadas() {
        return numeroJogadas;
    }

    public static void setNumeroJogadas() {
        Jogo.numeroJogadas++;
    }

    public static String getMelhorJogador() {
        return melhorJogador;
    }

    public static void setMelhorJogador(String melhorJogador) {
        Jogo.melhorJogador = melhorJogador;
    }

    public void jogar(int jogador, ArrayList<Jogador> ranking) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("\n=======================================================");
        System.out.println("=====            Pedra | Papel | Tesoura          =====");
        System.out.println("=======================================================");
        System.out.println("=====             Escolha uma opção:              =====");
        System.out.println("=====   (1) para Pedra                            =====");
        System.out.println("=====   (2) para Papel                            =====");
        System.out.println("=====   (3) para Tesoura                          =====");
        System.out.println("=====   (0) para sair                             =====");
        System.out.println("=======================================================");
        System.out.print("Digite a sua opção: ");
        int opcao2 = entrada.nextInt();
        if (opcao2 == 0) {
            return;
        }
        System.out.println("Computador escolheu " + escolhaComp +".");
        if (escolhaComp == opcao2){
            System.out.println("Empate");
        } else
        if ((escolhaComp - opcao2 == -1) || (escolhaComp - opcao2 == 2)) {
            System.out.println("Você Venceu!");
            ranking.get(jogador).adicionarPontos();
        } else {
            System.out.println("Você Perdeu!");
        }
        ranking.get(jogador).adicionarTentativa();
        System.out.println("Jogador: " + ranking.get(jogador).getNome());
        System.out.println("Pontos: " + ranking.get(jogador).getPontuacao());
        System.out.println("Tentativas: " + ranking.get(jogador).getNumeroTentativas());
    }
}
