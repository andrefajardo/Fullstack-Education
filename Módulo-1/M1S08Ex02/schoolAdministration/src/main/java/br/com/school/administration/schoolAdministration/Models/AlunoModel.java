package br.com.school.administration.schoolAdministration.Models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class AlunoModel {

    @Setter(AccessLevel.NONE) private Integer id;
    private String nome;
    private LocalDate dataNascimento;
    private static Integer proximoId = 1;

    private Integer proximoIdControl () {
        return proximoId++;
    }
}
