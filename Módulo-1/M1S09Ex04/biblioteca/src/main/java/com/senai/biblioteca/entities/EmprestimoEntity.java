package com.senai.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "emprestimo")
public class EmprestimoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonIgnoreProperties({"emprestimo"})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "livro_id", nullable = false)
    private LivroEntity livro;
    @JsonIgnoreProperties({"emprestimo"})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "membro_id", nullable = true)
    private MembroEntity membro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

}

