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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@Table(name = "tb_professor")
@NoArgsConstructor
public class ProfessorDB implements Serializable{
	
	private static final long serialVersionUID = 6988500944912237282L;	
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_professor")
	private long idProfessor;
	
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
	
	@OneToMany(targetEntity = MateriaDB.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "materiasCursada_id")
	private List<MateriaDB> materiasCursada;
	
}	
