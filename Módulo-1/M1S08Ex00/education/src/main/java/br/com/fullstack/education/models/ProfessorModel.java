package br.com.fullstack.education.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProfessorModel {

    @Getter public static final List<ProfessorModel> professoresCadastrados = new ArrayList<>();
    @Setter(AccessLevel.NONE) public static Integer proximoId = 1;

    private Integer id;
    private String nome;
    private String especialidade;

    public static ProfessorModel inserir(ProfessorModel professor) {
        professor.id = proximoId++;
        professoresCadastrados.add(professor);
        return professor;
    }

    public static boolean excluir (ProfessorModel professor) {
        professoresCadastrados.remove(professor);
        return true;
    }

    public static ProfessorModel buscarId (Integer id) throws Exception{
        for (ProfessorModel professor : professoresCadastrados) {
            if (professor.getId().equals(id)) {
                return professor;
            }
        }
        throw new Exception("Professor não encontrado.");
    }

}
