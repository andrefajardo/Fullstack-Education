public class Professor {
    private String nome;
    private String especialidade;
    private int codProf;

    public Professor(String nome, String especialidade, int codProf) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void ensinar(){
    }

    public int getCod() {
        return codProf;
    }
    public void setCod(int codProf) {
        this.codProf = codProf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCodProf() {
        return codProf;
    }

    public void setCodProf(int codProf) {
        this.codProf = codProf;
    }
}
