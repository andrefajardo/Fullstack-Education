// TODO: 07/02/2024 A lista de jogadores é exibida ao final de cada jogo,
//  se a lista tiver mais de 10 jogares devem aparecer apenas os top 10
//  jogadores. Ao exibir a lista o jogador deve ter um print ao final com
//  o seu nome e a sua posição. A lista deve ser exibida da seguinte forma:
//  nome do jogador - posição

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        setupJogadores();
        ArrayList<Jogador> ranking = setupJogadores();
        listarJogadores(ranking);
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

        return ranking;
    }

    public static void listarJogadores(ArrayList<Jogador> ranking) {
        Boolean top10 = false;

        if(ranking.size() <= 10) { // lista com menos de 10 jogadores
            for (int c = 0; c < ranking.size(); c++) {
                System.out.println("Jogador: " + ranking.get(c).getNome() + " - " + (c + 1) + "ª Posição");
            }
            top10 = true;
        } else {
            for (int c = 0; c < 10; c++) {
                System.out.println("Jogador: " + ranking.get(c).getNome() + " - " + (c + 1) + "ª Posição");
                if(ranking.get(c).getNome().equals("coringa")) {
//                    // jogador atual entre os 10. Não imprime separado.
                    top10 = true;
                }
            }
        }
        if(top10.equals(false)) {
            for (int c = 0; c < ranking.size(); c++) {
                if (ranking.get(c).getNome().equals("coringa")) {
                    System.out.println("****************************************************************************");
                    System.out.println("              Mensão Honrosa: Jogador: " + ranking.get(c).getNome() + " - " + (c + 1) + "ª Posição");
                    System.out.println("****************************************************************************");
                }
            }
        }
    }
}