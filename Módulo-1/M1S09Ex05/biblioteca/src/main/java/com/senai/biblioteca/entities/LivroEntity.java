package com.senai.biblioteca.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Table(name="livro")
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class LivroEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "livro", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<EmprestimoEntity> emprestimo;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

}
