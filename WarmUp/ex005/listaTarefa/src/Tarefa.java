public class Tarefa {
    private int cod;
    private String nome;
    private String descricao;
    private String data;
    private boolean status;

    public Tarefa() {

    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void adicionarTarefa(int cod, String nome, String descricao, String data, boolean status) {
        this.cod = cod;
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.status = status;
    }
    public void removerTarefa(int cod) {

    }
    public void concluirTarefa(int cod) {

    }
    public void listarTarefa(int cod) {
        System.out.println(getCod());
        System.out.println(getNome());
        System.out.println(getDescricao());
        System.out.println(getData());
        System.out.println(getStatus());
    }
}
