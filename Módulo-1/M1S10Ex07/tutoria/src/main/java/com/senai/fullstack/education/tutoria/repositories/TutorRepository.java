package com.senai.fullstack.education.tutoria.repositories;

import com.senai.fullstack.education.tutoria.entities.TutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<TutorEntity, Long> {
}
