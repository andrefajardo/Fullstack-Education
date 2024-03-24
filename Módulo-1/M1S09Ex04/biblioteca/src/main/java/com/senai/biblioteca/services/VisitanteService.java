package com.senai.biblioteca.services;

import com.senai.biblioteca.entities.VisitanteEntity;
import com.senai.biblioteca.repository.VisitanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteService {

    private final VisitanteRepository visitanteRepository;

    public VisitanteService(VisitanteRepository membroRepository) {
        this.visitanteRepository = membroRepository;
    }

    public VisitanteEntity salvar (VisitanteEntity membro) {
        return visitanteRepository.save(membro);
    }
    public List<VisitanteEntity> listarTodos () {
        return visitanteRepository.findAll();
    }
    public VisitanteEntity buscarPorId(Long id) throws Exception {
        return visitanteRepository.findById(id).orElseThrow(() -> new Exception("Visitante não encontrado"));
    }
    public void apagar(Long id) throws Exception {
        VisitanteEntity entity = buscarPorId(id);
        visitanteRepository.delete(entity);
    }
}
