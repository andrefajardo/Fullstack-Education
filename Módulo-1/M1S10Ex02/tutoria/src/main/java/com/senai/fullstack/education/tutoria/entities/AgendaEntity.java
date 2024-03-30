package com.senai.fullstack.education.tutoria.entities;

import com.senai.fullstack.education.tutoria.enums.StatusAgendaEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "agendas")
@Data
public class AgendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private AlunoEntity aluno;

    @ManyToOne
    @JoinColumn(name = "tutor_id", nullable = false)
    private TutorEntity tutor;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false)
    private StatusAgendaEnum status = StatusAgendaEnum.AGENDADO;

    @Column(nullable = false, length = 130)
    private String tema;

    private String descricao;

}