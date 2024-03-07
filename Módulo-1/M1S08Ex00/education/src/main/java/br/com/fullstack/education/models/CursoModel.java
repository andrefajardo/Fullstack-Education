package br.com.fullstack.education.models;

import ch.qos.logback.core.util.InvocationGate;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CursoModel {

    @Getter public static List<CursoModel> cursosCadastrados = new ArrayList<>();
    public static Integer proximoId = 1;

    private Integer id;
    @Setter private String nome;
    @Setter private String descricao;
    @Setter private Integer cargaHoraria;
    public List<ProfessorModel> professores = new ArrayList<>();

    public static CursoModel inserir(CursoModel curso) {
        curso.id = proximoId++;
        cursosCadastrados.add(curso);
        return curso;
    }

    public static boolean excluir (CursoModel curso) {
        cursosCadastrados.remove(curso);
        return true;
    }

    public static CursoModel buscarId (Integer id) throws Exception{
        for (CursoModel curso : cursosCadastrados) {
            if (curso.getId().equals(id)) {
                return curso;
            }
        }
        throw new Exception("Curso não encontrado.");
    }

    private static boolean validar (CursoModel curso) throws Exception{
        if (curso.getNome().isBlank()){
            throw new Exception("Nome precisar ser informado.");
        }
        if (curso.getCargaHoraria() < 100 || curso.getCargaHoraria() == null){
            throw new Exception("Carga horária insuficiênte ou não informada.");
        }
        return true;
    }

    public static void adicionarProfessor (CursoModel curso, ProfessorModel professor) {
        curso.getProfessores().add(professor);
    }
}
