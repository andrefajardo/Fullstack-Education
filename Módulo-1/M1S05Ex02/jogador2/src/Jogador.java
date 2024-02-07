// TODO: 07/02/2024 Todos os atributos devem estar como private.
//  Devemos ter um construtor que recebe todos os dados do jogador.
//  E devemos ter getters e setters para esse jogador.
public class Jogador {
    private String nome;
    private int idade;
    private int pontuacao;
    private int numeroTentativas;

    public Jogador(int idade, String nome, int pontuacao, int tentativas) {
        this.idade = idade;
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.numeroTentativas = tentativas;
    }


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
}