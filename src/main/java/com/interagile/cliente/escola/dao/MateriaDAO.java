package com.interagile.cliente.escola.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name = "tb_materia")
public class MateriaDAO implements Serializable{
		
	
	private static final long serialVersionUID = 6264468496220393607L;

	public MateriaDAO(){
		
	}
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id_materia")
	private Long idMateria;
	
	@NonNull
	@Column(name = "nome")
	private String nome;
	
	@Column(name="horas")
	private int horas;
	
	@NonNull
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="freq")
	private int frequencia;
	
	@Column(name="cursada")
	private boolean cursada;
	
}
