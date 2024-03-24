package com.senai.biblioteca.repository;

import com.senai.biblioteca.entities.MembroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE membro SET nome = :nome WHERE id = :id", nativeQuery = true)
    void updateNomeById(Long id, String nome);
}
