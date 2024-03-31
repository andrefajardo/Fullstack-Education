package com.senai.fullstack.education.tutoria.services;

import com.senai.fullstack.education.tutoria.entities.AlunoEntity;
import com.senai.fullstack.education.tutoria.exceptions.NotFoundException;
import com.senai.fullstack.education.tutoria.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlunoServiceImpl implements AlunoService{

    private final AlunoRepository alunoRepository;

    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public List<AlunoEntity> buscarTodos() {
        return alunoRepository.findAll();
    }

    @Override
    public AlunoEntity buscarPorId(Long id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Aluno não encontrado com o id " + id));
    }

    @Override
    public AlunoEntity criar(AlunoEntity aluno) {
        aluno.setId(null);
        return alunoRepository.save(aluno);
    }

    @Override
    public AlunoEntity alterar(Long id, AlunoEntity aluno) {
        buscarPorId(id);
        aluno.setId(id);
        return alunoRepository.save(aluno);
    }

    @Override
    public void excluir(Long id) {
        buscarPorId(id);
        AlunoEntity aluno = buscarPorId(id);
        alunoRepository.delete(aluno);
    }
}
