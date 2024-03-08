package br.com.school.administration.schoolAdministration.Models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class CursoModel {

    @Setter(AccessLevel.NONE) private Integer id;
    private String nome;
    private String descricao;
    private Integer cargaHoraria;

    private static Integer proximoId = 1;

    private static Integer proximoIdControl() {
        return proximoId++;
    }
}
