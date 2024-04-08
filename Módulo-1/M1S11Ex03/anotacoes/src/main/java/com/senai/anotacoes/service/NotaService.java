package com.senai.anotacoes.service;

import com.senai.anotacoes.entity.NotaEntity;

import java.util.List;

public interface NotaService {

    List<NotaEntity> buscarTodos();

    NotaEntity buscarPorId(Long id);

    NotaEntity criar(NotaEntity aluno);

    NotaEntity alterar(Long id, NotaEntity aluno);

    void excluir(Long id);

}