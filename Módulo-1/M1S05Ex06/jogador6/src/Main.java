// TODO: 09/02/2024
//  Crie a Classe Jogo, essa classe vai ter o jogo em si, o jogo consiste
//  em um pedra papel e tesoura, que o jogador deve inserir a sua jogada e
//  o sistema irá retorna se ele ganhou ou não.
//  O Jogo deve estar em um método jogar().
//  O Jogo deve ter o atributo, melhor jogador(melhorJogador) e deve ter o
//  número de vezes que o jogo foi jogado (numeroJogadas).
//  Cada vez que um jogador ganha ele deve receber mais um ponto, cada
//  tentativa adiciona ao numero de tentativas.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    public boolean onLine = false;
    public static void main(String[] args) {
        setupJogadores();
        ArrayList<Jogador> ranking = setupJogadores();
        listarJogadores(ranking);
        menu(ranking);
    }

    public static ArrayList<Jogador> setupJogadores() {
        ArrayList<Jogador> ranking = new ArrayList<>();

        Jogador j1 = new Jogador(20, "aaa", 4, 0);
        Jogador j2 = new Jogador(21, "bbb", 2, 0);
        Jogador j3 = new Jogador(23, "ccc", 8, 0);
        Jogador j4 = new Jogador(23, "ccc", 8, 0);
        Jogador j5 = new Jogador(24, "coringa", 0, 0);
        Jogador j6 = new Jogador(25, "eee", 10, 0);
        Jogador j7 = new Jogador(26, "fff", 11, 0);
        Jogador j8 = new Jogador(27, "ggg", 4, 0);
        Jogador j9 = new Jogador(28, "hhh", 5, 0);
        Jogador j10 = new Jogador(29, "iii", 9, 0);
        Jogador j11 = new Jogador(30, "jjj", 13, 0);
        Jogador j12 = new Jogador(31, "kkk", 6, 0);
        ranking.add(j1);
        ranking.add(j2);
        ranking.add(j3);
        ranking.add(j4);
        ranking.add(j5);
        ranking.add(j6);
        ranking.add(j7);
        ranking.add(j8);
        ranking.add(j9);
        ranking.add(j10);
        ranking.add(j11);
        ranking.add(j12);

        ranking.sort(Comparator.comparingInt(Jogador::getPontuacao));
        Collections.reverse(ranking);
        Jogo.setMelhorJogador(ranking.get(0).getNome());

        return ranking;
    }

    public static void menu(ArrayList<Jogador> ranking){

        Scanner entrada = new Scanner(System.in);
        SAIR_DO_LOOP:
        do {
            Mensagens.mainMenu();
            String opcao = entrada.next();

            // Consumir "ENTER" perdido
            entrada.nextLine();

            switch (opcao) {
                case "s":{
                    entrada.close();
                    int onLine = verificaOnLine(ranking);
                    ranking.get(onLine).setOnLine(false);
                    break SAIR_DO_LOOP; // Label que aponta para a sua referência ("mesmo_nome:") no ponto exterior do loop "Do While".
                }
                case "c": {
                    adicionarJogador(ranking);
                    break;
                }
                case "l": {
                    listarJogadores(ranking);
                    break ;
                }
                case "j": {
                    int jogadorOnLine = carregaJogador(ranking);
                    Jogo j1 = new Jogo();
                    j1.jogar(jogadorOnLine, ranking);
                    Jogo.setNumeroJogadas();
                    break ;
                }
                default:{
                    Mensagens.msgErro();
                    break;
                }
            }
        } while (true);
    }

    private static void adicionarJogador(ArrayList<Jogador> ranking) {
        Scanner entrada = new Scanner(System.in);
        boolean valido = false;
        do {
            System.out.print("Informe o jogador: ");
            String nome = entrada.nextLine();
            valido = validacao(ranking, nome);
            if (valido == true) {
                Mensagens.validaJogador();
            } else {
                System.out.print("Informe a idade: ");
                int idade = entrada.nextInt();
                int pontuacao = 0;
                int tentativa = 0;
                Jogador jogador = new Jogador(idade, nome, pontuacao, tentativa);
                jogador.setOnLine(true);
                ranking.add(jogador);
                valido = false;
            }
        } while (valido);

    }

    private static int carregaJogador(ArrayList<Jogador> ranking) {
        Scanner entrada = new Scanner(System.in);
        boolean valido = false;
        int jogadorOnLine = -1;

        System.out.print("Informe o jogador: ");
        String nome = entrada.nextLine();
        valido = validacao(ranking, nome);
        if (valido == false) {
            Mensagens.JogadorInexistente();
        } else {
            for (int c=0 ; c<ranking.size(); c++) {
                if (ranking.get(c).getNome().equals(nome)) {
                    jogadorOnLine = c;
                    ranking.get(c).setOnLine(true);
                }
            }
        }
        return jogadorOnLine;
    }

    public static int verificaOnLine(ArrayList<Jogador> ranking) {
        int onLine = -1;
        for (int c=0 ; c<ranking.size(); c++) {
            if (ranking.get(c).isOnLine() == true) {
                onLine = c;
            }
        }
        return  onLine;
    }

    public static boolean validacao(ArrayList<Jogador> ranking, String nome) {
        boolean validacao = false;
        for (Jogador j : ranking) {
            if (j.getNome().equals(nome)) {
                validacao = true;
            }
        }
        return validacao;
    }

    public static void listarJogadores(ArrayList<Jogador> ranking) {
        ranking.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());
        Boolean top10 = false;
        if(ranking.size() <= 10) { // lista com menos de 10 jogadores
            for (int c = 0; c < ranking.size(); c++) {
                System.out.println("Jogador: " + ranking.get(c).getNome() + " - " + (c + 1) + "ª Posição");
            }
            top10 = true;
        } else {
            for (int c = 0; c < 10; c++) {
                System.out.println("Jogador: " + ranking.get(c).getNome() + " - " + (c + 1) + "ª Posição");
                if(ranking.get(c).isOnLine() && (verificaOnLine(ranking) != -1)) {
                    top10 = true;
                }
            }
        }
        if(top10.equals(false) && (verificaOnLine(ranking) != -1)) {
            Mensagens.mensaoHonrosa(ranking);
        }
        Mensagens.melhorJogador();
    }
}