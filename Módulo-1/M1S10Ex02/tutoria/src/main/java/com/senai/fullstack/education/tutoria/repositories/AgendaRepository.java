package com.senai.fullstack.education.tutoria.repositories;

import com.senai.fullstack.education.tutoria.entities.AgendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository<AgendaEntity, Long> {

}
