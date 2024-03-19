package com.senai.biblioteca.services;

import com.senai.biblioteca.entities.MembroEntity;
import com.senai.biblioteca.repository.MembroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroService {

    private final MembroRepository membroRepository;

    public MembroService(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    public MembroEntity salvar (MembroEntity membro) {
        return membroRepository.save(membro);
    }
    public List<MembroEntity> listarTodos () {
        return membroRepository.findAll();
    }
}
