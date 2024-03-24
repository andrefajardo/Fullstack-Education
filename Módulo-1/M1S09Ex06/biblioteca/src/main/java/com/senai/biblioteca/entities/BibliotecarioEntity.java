package com.senai.biblioteca.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Table(name="bibliotecario")
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BibliotecarioEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;

}
