package com.senai.fullstack.education.tutoria.services;

import com.senai.fullstack.education.tutoria.entities.AgendamentoEntity;

import java.util.List;

public interface AgendamentoService {
    List<AgendamentoEntity> buscarTodos();
    AgendamentoEntity buscarPorId(Long id);
    AgendamentoEntity criar(AgendamentoEntity agenda);
    AgendamentoEntity alterar(Long id, AgendamentoEntity agenda);
    void excluir(Long id);
    List<AgendamentoEntity> buscarPorAlunoId(Long alunoId);
    List<AgendamentoEntity> buscarPorTutorId(Long tutorId);
}
