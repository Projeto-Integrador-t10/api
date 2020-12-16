package com.vendaverde.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@NotNull
	@Size(min = 1, max = 150)
	private String nome;
	
	@NotNull
	private BigDecimal preco;
	
	@NotNull
	private int quantidade;
	
	@NotNull
	private boolean estoque;
	
	private String imag1;
	private String imag2;
	private String imag3;
	
	private String doacao;
	
	@NotNull
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public BigDecimal getPreco() {return preco;}
	public void setPreco(BigDecimal preco) {this.preco = preco;}
	public int getQuantidade() {return quantidade;}
	public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
	public boolean isEstoque() {return estoque;}
	public void setEstoque(boolean estoque) {this.estoque = estoque;}
	public Categoria getCategoria() {return categoria;}
	public void setCategoria(Categoria categoria) {this.categoria = categoria;}
	public String getDoacao() {return doacao;}
	public void setDoacao(String doacao) {this.doacao = doacao;}
	public String getImag1() { return imag1;}
	public void setImag1(String imag1) {this.imag1 = imag1;	}
	public String getImag2() {return imag2;	}
	public void setImag2(String imag2) {this.imag2 = imag2;	}
	public String getImag3() {return imag3;	}
	public void setImag3(String imag3) {this.imag3 = imag3;	}	
}