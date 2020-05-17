package com.interagile.cliente.escola.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@EqualsAndHashCode(exclude = "materias")
@Entity
@Data
@Table(name = "tb_curso")
public class CursoDB implements Serializable {

	private static final long serialVersionUID = -5203036138487050071L;

	public CursoDB() {
	}

	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id_curso")
	private long id;

	@NonNull
	@Column(name = "cod")
	private String codigo;

	@NonNull
	@Column(name = "nome")
	private String nome;

	@Column(name = "semestres")
	private int semestres;

	@OneToMany(targetEntity = MateriaDB.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "materias_id")
	private List<MateriaDB> materias = new ArrayList<>();

}