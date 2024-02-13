
public class Jogador {
    private String nome;
    private int idade;
    private int pontuacao;
    private int numeroTentativas;
    private boolean onLine = false;

    public Jogador(int idade, String nome, int pontuacao, int tentativas) {
        this.idade = idade;
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.numeroTentativas = tentativas;
    }


    public void adicionarPontos() {
        this.pontuacao++;
    }

    public void perderPontos(int pontos) {
        this.pontuacao -= pontos;
    }

    public int adicionarTentativa() {
        numeroTentativas++;
        return numeroTentativas;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNumeroTentativas() {
        return numeroTentativas;
    }

    public void setOnLine(boolean onLine) {
        this.onLine = onLine;
    }
    public boolean isOnLine() {
        return onLine;
    }
}