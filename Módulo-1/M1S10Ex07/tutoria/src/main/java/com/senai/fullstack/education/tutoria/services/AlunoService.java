package com.senai.fullstack.education.tutoria.services;

import com.senai.fullstack.education.tutoria.entities.AlunoEntity;

import java.util.List;

public interface AlunoService {
    List<AlunoEntity> buscarTodos();
    AlunoEntity buscarPorId(Long id);
    AlunoEntity criar(AlunoEntity aluno);
    AlunoEntity alterar(Long id, AlunoEntity aluno);
    void excluir(Long id);

}
