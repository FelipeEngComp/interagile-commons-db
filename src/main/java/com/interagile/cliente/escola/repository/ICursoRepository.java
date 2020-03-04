package com.interagile.cliente.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.interagile.cliente.escola.dao.CursoDAO;

public interface ICursoRepository extends JpaRepository<CursoDAO, Long>{
	
	@Query("select c from CursoDAO c where c.codigo =:codigo")
	public CursoDAO findCursoByCodigo(@Param("codigo")String codigo);
	
}
