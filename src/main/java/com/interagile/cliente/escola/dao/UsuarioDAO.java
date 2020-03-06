package com.interagile.cliente.escola.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name = "tb_usuario")
public class UsuarioDAO implements Serializable{
	
	private static final long serialVersionUID = 5402066257568990643L;
	
	public UsuarioDAO() {
	}
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private long idUsuario;
	
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
	
	@Column(name = "tipousr")
	private int tipoUsuario;
	
	@Column(name = "smest")
	private int semestre;
	
	@JoinColumn(name = "id_curso")
	@ManyToOne(fetch = FetchType.EAGER)
	private CursoDAO curso;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<MateriaDAO> materias;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<LivroDAO> livros;
	
}
