package com.senai.fullstack.education.tutoria.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "alunos")
@Data
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 150)
    private String nome;

}
