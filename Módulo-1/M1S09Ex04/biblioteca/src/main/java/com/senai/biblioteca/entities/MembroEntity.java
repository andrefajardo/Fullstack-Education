package com.senai.biblioteca.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.List;

@Table(name="membro")
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MembroEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "membro", fetch = FetchType.EAGER)
    private List<EmprestimoEntity> emprestimo;
    private String nome;
    private String endereco;
    private String telefone;
}
