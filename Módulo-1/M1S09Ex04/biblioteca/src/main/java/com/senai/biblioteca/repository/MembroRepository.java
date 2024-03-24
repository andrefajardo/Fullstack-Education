package com.senai.biblioteca.repository;

import com.senai.biblioteca.entities.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface MembroRepository extends JpaRepository<MembroEntity, Long> {
    }
