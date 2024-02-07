// TODO: 07/02/2024 Devemos ter uma lista dos melhores jogadores.
//  Essa lista terá os objetos de cada jogador, e a posição deles
//  na lista reflete o ranking desse jogador.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        setupJogadores();
    }

    public static ArrayList<Jogador> setupJogadores() {
        ArrayList<Jogador> ranking = new ArrayList<>();

        Jogador j1 = new Jogador(21, "aaa", 4, 0);
        Jogador j2 = new Jogador(22, "bbb", 2, 0);
        Jogador j3 = new Jogador(23, "ccc", 8, 0);
        Jogador j4 = new Jogador(24, "ddd", 4, 0);
        ranking.add(j1);
        ranking.add(j2);
        ranking.add(j3);
        ranking.add(j4);

        ranking.sort(Comparator.comparingInt(Jogador::getPontuacao));
        Collections.reverse(ranking);

        for (int c = 0; c < ranking.size(); c++) {
            System.out.println(c + 1 + "° ----> Jogador: " + ranking.get(c).getNome() + " | Idade: " + ranking.get(c).getIdade() + " |  Pontuação: " +  ranking.get(c).getPontuacao());
        }
        return ranking;
    }
}