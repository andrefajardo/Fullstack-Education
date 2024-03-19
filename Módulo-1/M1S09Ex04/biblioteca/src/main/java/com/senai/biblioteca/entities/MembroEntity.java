package com.senai.biblioteca.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

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
    private String nome;
    private String endereco;
    private Integer telefone;

}
