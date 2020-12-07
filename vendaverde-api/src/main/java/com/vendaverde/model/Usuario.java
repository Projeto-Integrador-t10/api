package com.vendaverde.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 2, max = 100)
	private String nome;
	
	@Size(min = 5, max = 100)
	@NotNull
	private String usuario;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String senha;
	
	private String tipo;

	public Long getId() {return id;	}
	public void setId(Long id) {this.id = id;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getUsuario() {return usuario;}
	public void setUsuario(String usuario) {this.usuario = usuario;}
	public String getSenha() {return senha;}
	public void setSenha(String senha) {this.senha = senha;}
	public String getTipo() {return tipo;}
	public void setTipo(String tipo) {this.tipo = tipo;	}	
}