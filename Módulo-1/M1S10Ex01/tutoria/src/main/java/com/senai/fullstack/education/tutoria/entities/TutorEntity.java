package com.senai.fullstack.education.tutoria.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tutores")
@Data
public class TutorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 150)
    private String nome;
    @Column(nullable = false, length = 100)
    private String especialidade;

}
