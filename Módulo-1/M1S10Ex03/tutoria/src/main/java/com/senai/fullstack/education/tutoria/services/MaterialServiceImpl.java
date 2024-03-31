package com.senai.fullstack.education.tutoria.services;

import com.senai.fullstack.education.tutoria.entities.MaterialEntity;
import com.senai.fullstack.education.tutoria.exceptions.NotFoundException;
import com.senai.fullstack.education.tutoria.repositories.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService{

    private final MaterialRepository materialRepository;

    public MaterialServiceImpl(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    @Override
    public List<MaterialEntity> buscarTodos() {
        return materialRepository.findAll();
    }

    @Override
    public MaterialEntity buscarPorId(Long id) {
        return materialRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Material não encontrado com o id " + id));
    }

    @Override
    public MaterialEntity criar(MaterialEntity material) {
        material.setId(null);
        return materialRepository.save(material);
    }

    @Override
    public MaterialEntity alterar(Long id, MaterialEntity material) {
        buscarPorId(id);
        material.setId(id);
        return materialRepository.save(material);
    }

    @Override
    public void excluir(Long id) {
        buscarPorId(id);
        MaterialEntity material = buscarPorId(id);
        materialRepository.delete(material);
    }
}
