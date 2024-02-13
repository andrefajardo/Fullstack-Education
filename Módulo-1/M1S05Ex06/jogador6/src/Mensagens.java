import java.util.ArrayList;

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
}
