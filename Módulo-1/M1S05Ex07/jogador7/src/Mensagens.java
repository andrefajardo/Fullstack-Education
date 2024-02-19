import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Mensagens {

    public static void msgErro() {
        System.out.print("=======================================================\n");
        System.out.print("=====                Opção INVÁLIDA!              =====\n");
        System.out.print("=======================================================\n");

    }

    public static void mainMenu() {
        System.out.println("\n=======================================================");
        System.out.println("=====            Bem-vindo ao Game Play           =====");
        System.out.println("=======================================================");
        System.out.println("=====             Escolha uma opção:              =====");
        System.out.println("=====   (c) para cadastrar jogador                =====");
        System.out.println("=====   (l) para listar jogadores                 =====");
        System.out.println("=====   (j) para jogar                            =====");
        System.out.println("=====   (s) para sair                             =====");
        System.out.println("=======================================================");
        System.out.print("===== Opção: ");
    }

    public static void validaJogador() {
        System.out.print("=======================================================\n");
        System.out.print("==      Jogador já existe, informe outro nome.       ==\n");
        System.out.print("=======================================================\n");
    }

    public static boolean JogadorInexistente() {
        System.out.print("=======================================================\n");
        System.out.print("==              Jogador não cadastrado!              ==\n");
        System.out.print("=======================================================\n");
        return true;
    }

    public static void mensaoHonrosa(ArrayList<Jogador> ranking)  {
        for (int c = 0; c < ranking.size(); c++) {
            if (ranking.get(c).isOnLine()) {
                System.out.println("****************************************************************************");
                System.out.println("              Mensão Honrosa: Jogador: " + ranking.get(c).getNome() + " - " + (c + 1) + "ª Posição");
                System.out.println("****************************************************************************");
            }
        }
    }

    public static void melhorJogador() {
        System.out.println("****************************************************************************");
        System.out.println("              Melhor Jogador: " + Jogo.getMelhorJogador());
        System.out.println("****************************************************************************");
    }

    public static void menuPedraPapelTesoura() {
        System.out.println("\n=======================================================");
        System.out.println("=====            Pedra | Papel | Tesoura          =====");
        System.out.println("=======================================================");
        System.out.println("=====             Escolha uma opção:              =====");
        System.out.println("=====   (1) para Pedra                            =====");
        System.out.println("=====   (2) para Papel                            =====");
        System.out.println("=====   (3) para Tesoura                          =====");
        System.out.println("=====   (0) para sair                             =====");
        System.out.println("=======================================================");
    }

    public static void menuJogos() {
        System.out.println("\n=======================================================");
        System.out.println("=====               Escolha o Jogo                =====");
        System.out.println("=======================================================");
        System.out.println("=====             Escolha uma opção:              =====");
        System.out.println("=====   (1) para Pedra Papel Tesoura              =====");
        System.out.println("=====   (2) para Advinhe o número                 =====");
        System.out.println("=======================================================");
    }

    public static void menuJogoAdivinhaNumero(int chances) {
        System.out.println("\n=======================================================");
        System.out.println("=====            Adivinhe o número oculto         =====");
        System.out.println("=====    de 0 a 100. Você tem " + chances + " tentativa(s)      =====");
        System.out.println("=======================================================");
        System.out.print("Escolha um número: ");
    }
}
