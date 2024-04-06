package com.senai.anotacoes.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "caderno")
public class CadernoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    private String nome;
}