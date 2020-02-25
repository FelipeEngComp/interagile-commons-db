package com.interagile.cliente.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.interagile.cliente.escola.dao.MateriaDAO;

public interface IMateriaRepository extends JpaRepository<MateriaDAO, Long> {

	@Query("select m from MateriaDAO m where m.codigo =:codigo")
	MateriaDAO findMateriaByCodigo(@Param("codigo")String codigo);

	@Transactional
	@Modifying
	@Query("delete from MateriaDAO m where m.codigo =:codigo")
	void deleteMateriaByCodigo(@Param("codigo")String codigo);
}
