package com.interagile.cliente.escola.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name = "tb_blklist")
public class BlackListDAO implements Serializable{
	
	private static final long serialVersionUID = -8130223220693787884L;
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_blklist")
	private Long id;
	 
	@Column(name = "mat_blklist")
	@NonNull
	private String matricula;
	
	@Column(name = "nome")
	@NonNull
	private String nome;
	
	@Column(name = "mot")
	private String motivo;
	
	@Column(name = "diasbloq")
	private int diasBloqueado;
	
	@Column(name = "qntbloq")
	private int qntBloqueios;
	
}
