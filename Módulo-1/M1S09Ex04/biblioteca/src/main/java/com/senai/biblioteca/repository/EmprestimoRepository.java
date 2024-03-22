package com.senai.biblioteca.repository;

import com.senai.biblioteca.entities.EmprestimoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {
}
