package com.senai.fullstack.education.tutoria.repositories;

import com.senai.fullstack.education.tutoria.entities.AgendamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, Long> {

    List<AgendamentoEntity> findByAlunoIdOrderByData (Long alunoId);
    List<AgendamentoEntity> findByTutorIdOrderByData(Long tutorId);
}
