package com.senai.biblioteca.services;

import com.senai.biblioteca.entities.BibliotecarioEntity;
import com.senai.biblioteca.repository.BibliotecarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioService(BibliotecarioRepository bibliotecarioRepository) {
        this.bibliotecarioRepository = bibliotecarioRepository;
    }

    public BibliotecarioEntity salvar (BibliotecarioEntity bibliotecario) {
        return bibliotecarioRepository.save(bibliotecario);
    }
    public List<BibliotecarioEntity> listarTodos () {
        return bibliotecarioRepository.findAll();
    }
}
