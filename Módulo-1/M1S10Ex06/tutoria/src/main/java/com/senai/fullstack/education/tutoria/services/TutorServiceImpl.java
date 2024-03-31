package com.senai.fullstack.education.tutoria.services;

import com.senai.fullstack.education.tutoria.entities.TutorEntity;
import com.senai.fullstack.education.tutoria.exceptions.NotFoundException;
import com.senai.fullstack.education.tutoria.repositories.TutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorServiceImpl implements TutorService{

    private final TutorRepository tutorRepository;

    public TutorServiceImpl(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    @Override
    public List<TutorEntity> buscarTodos() {
        return tutorRepository.findAll();
    }

    @Override
    public TutorEntity buscarPorId(Long id) {
        return tutorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Tutor não encontrado com o id " + id));
    }

    @Override
    public TutorEntity criar(TutorEntity tutor) {
        tutor.setId(null);
        return tutorRepository.save(tutor);
    }

    @Override
    public TutorEntity alterar(Long id, TutorEntity tutor) {
        buscarPorId(id);
        tutor.setId(id);
        return tutorRepository.save(tutor);
    }

    @Override
    public void excluir(Long id) {
        buscarPorId(id);
        TutorEntity tutor = buscarPorId(id);
        tutorRepository.delete(tutor);
    }
}
