package com.senai.biblioteca.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "emprestimo")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmprestimoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    private LivroEntity livro;
    @ManyToOne(optional = false)
    private MembroEntity membro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
}

