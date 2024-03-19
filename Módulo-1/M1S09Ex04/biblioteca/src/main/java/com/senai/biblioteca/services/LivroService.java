package com.senai.biblioteca.services;

import com.senai.biblioteca.entities.LivroEntity;
import com.senai.biblioteca.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public LivroEntity salvar (LivroEntity livro) {
        return livroRepository.save(livro);
    }

    public List<LivroEntity> listarTodos() {
        return livroRepository.findAll();
    }
}
