package com.senai.biblioteca.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

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
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

}
