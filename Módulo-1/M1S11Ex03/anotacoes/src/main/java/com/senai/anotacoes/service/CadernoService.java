package com.senai.anotacoes.service;

import com.senai.anotacoes.entity.CadernoEntity;

import java.util.List;

public interface CadernoService {

    List<CadernoEntity> buscarTodos();

    CadernoEntity buscarPorId(Long id);

    CadernoEntity criar(CadernoEntity aluno);

    CadernoEntity alterar(Long id, CadernoEntity aluno);

    void excluir(Long id);

}