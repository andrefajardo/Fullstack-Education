package com.senai.anotacoes.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "nota")
public class NotaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "caderno_id")
    private CadernoEntity caderno;

    private String titulo;
    private String conteudo;
}