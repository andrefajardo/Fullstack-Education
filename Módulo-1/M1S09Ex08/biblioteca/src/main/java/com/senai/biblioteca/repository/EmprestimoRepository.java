package com.senai.biblioteca.repository;

import com.senai.biblioteca.entities.EmprestimoEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE emprestimo SET data_devolucao = :dataDevolucao WHERE id = :id", nativeQuery = true)
    void updateDataDevolucaoById(Long id, LocalDate dataDevolucao);
}
