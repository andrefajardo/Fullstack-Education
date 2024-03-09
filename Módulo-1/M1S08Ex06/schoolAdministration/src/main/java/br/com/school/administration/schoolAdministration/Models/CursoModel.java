package br.com.school.administration.schoolAdministration.Models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class CursoModel {

    @Getter private static List<CursoModel> cursos = new ArrayList<>();

    @Setter(AccessLevel.NONE) private Integer id;
    private String nome;
    private String descricao;
    private Integer cargaHoraria;
    private static Integer proximoId = 1;

    private static Integer getProximoId() {
        return proximoId++;
    }

    public static CursoModel inserir (CursoModel curso) {
        curso.id = getProximoId();
        cursos.add(curso);
        return curso;
    }
}
