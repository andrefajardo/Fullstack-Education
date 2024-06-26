package com.senai.fullstack.education.tutoria.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "materiais")
@Data
public class MaterialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agenda_id", nullable = false)
    private AgendamentoEntity agenda;

    private String descricao;

    @Column(nullable = false)
    private String caminhoArquivo;
}
