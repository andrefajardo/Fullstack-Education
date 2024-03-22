package com.senai.biblioteca.services;

import com.senai.biblioteca.entities.LivroEntity;
import com.senai.biblioteca.entities.MembroEntity;
import com.senai.biblioteca.entities.VisitanteEntity;
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
    public List<MembroEntity> listarTodos () throws Exception {
        return membroRepository.findAll();
    }
    public MembroEntity buscarPorId(Long id) throws Exception {
        return membroRepository.findById(id).orElseThrow(() -> new Exception("Membro não encontrado"));
    }
    public void apagar(Long id) throws Exception {
        MembroEntity entity = buscarPorId(id);
        membroRepository.delete(entity);
    }
}
