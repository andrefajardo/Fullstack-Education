package com.senai.fullstack.education.tutoria.services;

import com.senai.fullstack.education.tutoria.entities.TutorEntity;

import java.util.List;

public interface TutorService {
    List<TutorEntity> buscarTodos();
    TutorEntity buscarPorId(Long id);
    TutorEntity criar(TutorEntity tutor);
    TutorEntity alterar(Long id, TutorEntity tutor);
    void excluir(Long id);

}
