package com.senai.fullstack.education.tutoria.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "materiais")
@Data
public class MateriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agenda_id", nullable = false)
    private AgendaEntity agenda;

    private String descricao;

    @Column(nullable = false)
    private String caminhoArquivo;
}
