package com.senai.fullstack.education.tutoria.repositories;

import com.senai.fullstack.education.tutoria.entities.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<MaterialEntity, Long> {

}
