import java.util.ArrayList;

public class Curso {
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private int codCurso;
    private String status;

    public Curso(String nome, String descricao, int cargaHoraria, int codCurso) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.codCurso = codCurso;
        this.status = "Aberto";
    }

    public void progresso(){
    }
    public void notas() {
    }
    public void participacao() {
    }
    public int getCodCurso() {
        return codCurso;
    }
    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
