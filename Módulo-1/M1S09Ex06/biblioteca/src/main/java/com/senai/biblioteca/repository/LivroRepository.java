package com.senai.biblioteca.repository;

import com.senai.biblioteca.entities.LivroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE livro SET titulo = :titulo WHERE id = :id", nativeQuery = true)
    void updateTituloById(Long id, String titulo);

}
