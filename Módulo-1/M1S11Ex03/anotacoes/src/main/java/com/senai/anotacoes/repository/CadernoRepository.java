package com.senai.anotacoes.repository;

import com.senai.anotacoes.entity.CadernoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadernoRepository extends JpaRepository<CadernoEntity, Long> {

}
