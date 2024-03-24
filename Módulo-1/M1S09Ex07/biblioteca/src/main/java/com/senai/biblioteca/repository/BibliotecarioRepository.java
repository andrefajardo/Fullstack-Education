package com.senai.biblioteca.repository;

import com.senai.biblioteca.entities.BibliotecarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE bibliotecario SET nome = :nome WHERE id = :id", nativeQuery = true)
    void updateNomeById(Long id, String nome);
}
