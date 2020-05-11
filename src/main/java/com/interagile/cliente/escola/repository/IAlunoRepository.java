package com.interagile.cliente.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interagile.cliente.escola.model.AlunoDB;

@Repository
public interface IAlunoRepository extends JpaRepository<AlunoDB, Long>{

}
