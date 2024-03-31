package com.senai.fullstack.education.tutoria.services;

import com.senai.fullstack.education.tutoria.entities.MaterialEntity;

import java.util.List;

public interface MaterialService {
    List<MaterialEntity> buscarTodos();
    MaterialEntity buscarPorId(Long id);
    MaterialEntity criar(MaterialEntity material);
    MaterialEntity alterar(Long id, MaterialEntity material);
    void excluir(Long id);

}
