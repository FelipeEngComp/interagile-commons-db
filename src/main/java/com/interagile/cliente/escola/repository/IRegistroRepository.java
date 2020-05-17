package com.interagile.cliente.escola.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.interagile.cliente.escola.model.RegistroDB;

@Repository
public interface IRegistroRepository extends JpaRepository<RegistroDB, Long>{
	
	@Query("select r from RegistroDB r where r.cpf =:cpf")
	RegistroDB findRegistroByCpf(String cpf);
}
