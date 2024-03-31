package com.senai.fullstack.education.tutoria.entities;

import com.senai.fullstack.education.tutoria.enums.StatusAgendaEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "agendamentos")
@Data
public class AgendamentoEntity {

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
    private LocalDateTime data;

    @Column(nullable = false)
    private StatusAgendaEnum status = StatusAgendaEnum.AGENDADO;

    @Column(nullable = false, length = 130)
    private String tema;

    private String descricao;

}