package com.senai.anotacoes.service;

import com.senai.anotacoes.entity.NotaEntity;
import com.senai.anotacoes.exception.NotFoundException;
import com.senai.anotacoes.repository.NotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaServiceImpl implements NotaService{

    private final NotaRepository notaRepository;

    public NotaServiceImpl(NotaRepository notaRepository) {
        this.notaRepository = notaRepository;
    }

    @Override
    public List<NotaEntity> buscarTodos() {
        return notaRepository.findAll();
    }

    @Override
    public NotaEntity buscarPorId(Long id) {
        return notaRepository.findById(id).orElseThrow(() -> new NotFoundException("Nota não encontrado com o id " + id));
    }

    @Override
    public NotaEntity criar(NotaEntity nota) {
        return notaRepository.save(nota);
    }

    @Override
    public NotaEntity alterar(Long id, NotaEntity nota) {
        buscarPorId(id);
        nota.setId(id);
        return notaRepository.save(nota);
    }

    @Override
    public void excluir(Long id) {
        NotaEntity aluno = buscarPorId(id);
        notaRepository.delete(aluno);
    }
}
