package com.senai.biblioteca.repository;

import com.senai.biblioteca.entities.VisitanteEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE visitante SET nome = :nome WHERE id = :id", nativeQuery = true)
    void updateNomeById(Long id, String nome);
}
