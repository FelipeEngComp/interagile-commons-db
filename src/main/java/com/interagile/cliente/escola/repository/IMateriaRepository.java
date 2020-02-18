package com.interagile.cliente.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.interagile.cliente.escola.dao.MateriaDAO;

public interface IMateriaRepository extends JpaRepository<MateriaDAO, Long>{
	
	@Query("select m from MateriaDAO m where m.codigo =:codigo")
	MateriaDAO findMateriaByCodigo(String codigo);
	
}
