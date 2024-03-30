package com.senai.fullstack.education.tutoria.repositories;

import com.senai.fullstack.education.tutoria.entities.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {

}
