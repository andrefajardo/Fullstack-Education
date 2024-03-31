package com.senai.fullstack.education.tutoria.services;

import com.senai.fullstack.education.tutoria.entities.AgendamentoEntity;
import com.senai.fullstack.education.tutoria.entities.AlunoEntity;
import com.senai.fullstack.education.tutoria.entities.TutorEntity;
import com.senai.fullstack.education.tutoria.exceptions.NotFoundException;
import com.senai.fullstack.education.tutoria.repositories.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;
    private final AlunoService alunoService;
    private final TutorService tutorService;

    public AgendamentoServiceImpl(AgendamentoRepository agendamentoRepository, AlunoService alunoService, TutorService tutorService) {
        this.agendamentoRepository = agendamentoRepository;
        this.alunoService = alunoService;
        this.tutorService = tutorService;
    }

    @Override
    public List<AgendamentoEntity> buscarTodos() {
        return agendamentoRepository.findAll();
    }

    @Override
    public AgendamentoEntity buscarPorId(Long id) {
        return agendamentoRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Agenda não encontrada com o id " + id));
    }

    @Override
    public AgendamentoEntity criar(AgendamentoEntity agendamento) {
        agendamento.setId(null);

        AlunoEntity aluno = alunoService.buscarPorId(agendamento.getAluno().getId());
        agendamento.setAluno(aluno);
        TutorEntity tutor = tutorService.buscarPorId(agendamento.getTutor().getId());
        agendamento.setTutor(tutor);

        return agendamentoRepository.save(agendamento);
    }

    @Override
    public AgendamentoEntity alterar(Long id, AgendamentoEntity agendamento) {
        buscarPorId(id);

        AlunoEntity aluno = alunoService.buscarPorId(agendamento.getAluno().getId());
        agendamento.setAluno(aluno);
        TutorEntity tutor = tutorService.buscarPorId(agendamento.getTutor().getId());
        agendamento.setTutor(tutor);

        agendamento.setId(id);
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public void excluir(Long id) {
        buscarPorId(id);
        AgendamentoEntity agendamento = buscarPorId(id);
        agendamentoRepository.delete(agendamento);
    }

    @Override
    public List<AgendamentoEntity> buscarPorAlunoId(Long alunoId) {
        AlunoEntity aluno = alunoService.buscarPorId(alunoId);
        return agendamentoRepository.findByAlunoIdOrderByData(alunoId);
    }

    @Override
    public List<AgendamentoEntity> buscarPorTutorId(Long tutorId) {
        TutorEntity tutor = tutorService.buscarPorId(tutorId);
        return agendamentoRepository.findByTutorIdOrderByData(tutorId);
    }
}
