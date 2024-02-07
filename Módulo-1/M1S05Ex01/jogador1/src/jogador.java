public class jogador {
    private String nome;
    private int idade;
    private int pontuacao;
    private int numeroTentativas;

    public void adicionarPontos(int pontos) {
        this.pontuacao += pontos;

    }
    public void perderPontos(int pontos) {
        this.pontuacao -= pontos;
    }
    public int adicionarTentativa() {
        numeroTentativas++;
        return numeroTentativas;
    }
}
