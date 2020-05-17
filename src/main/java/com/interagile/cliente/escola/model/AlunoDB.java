package com.interagile.cliente.escola.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name = "tb_usuario")
public class AlunoDB implements Serializable{
	
	private static final long serialVersionUID = 5402066257568990643L;
	
	public AlunoDB() {
	}
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_aluno")
	private long idAluno;
	
	@Column(name = "cpf")
	@NonNull
	private String cpf;
	
	@Column(name = "email")
	@NonNull
	private String email;
	
	@Column(name = "tel")
	private Long telefone;
	
	@Column(name = "nome")
	@NonNull
	private String nome;
	
	@Column(name = "mat")
	@NonNull
	private String matricula;
	
	@Column(name = "smest")
	private int semestre;
	
	@JoinColumn(name = "id_curso")
	@OneToOne(fetch = FetchType.EAGER)
	private CursoDB curso;
	
	@OneToMany(targetEntity = MateriaDB.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "materiasCursada_id")
	private List<MateriaDB> materiasCursada;

	@OneToMany(targetEntity = LivroDB.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "livrosAlugados_id")
	private List<LivroDB> livrosAlugados;
	
}
