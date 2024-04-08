package com.senai.anotacoes.service;

import com.senai.anotacoes.entity.CadernoEntity;
import com.senai.anotacoes.exception.NotFoundException;
import com.senai.anotacoes.repository.CadernoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadernoServiceImpl implements CadernoService{

    private final CadernoRepository cadernoRepository;

    public CadernoServiceImpl(CadernoRepository cadernoRepository) {
        this.cadernoRepository = cadernoRepository;
    }

    @Override
    public List<CadernoEntity> buscarTodos() {
        return cadernoRepository.findAll();
    }

    @Override
    public CadernoEntity buscarPorId(Long id) {
        return cadernoRepository.findById(id).orElseThrow(() -> new NotFoundException("Caderno não encontrado com o id " + id));
    }

    @Override
    public CadernoEntity criar(CadernoEntity caderno) {
        return cadernoRepository.save(caderno);
    }

    @Override
    public CadernoEntity alterar(Long id, CadernoEntity caderno) {
        buscarPorId(id);
        caderno.setId(id);
        return cadernoRepository.save(caderno);
    }

    @Override
    public void excluir(Long id) {
        CadernoEntity aluno = buscarPorId(id);
        cadernoRepository.delete(aluno);
    }
}
