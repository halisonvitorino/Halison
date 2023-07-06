package com.halisonvitorino.filmesOnline.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Filme implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long codigoFilme;

	private String  titulo;
	private String  genero;
	private String  diretor;
	private String  distribuidora;
	private String  produtora;	
	private int ano; 
	private int duracao;	

	public long getCodigoFilme() {
		return codigoFilme;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public String getDiretor() {
		return diretor;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public String getProdutora() {
		return produtora;
	}

	public int getAno() {
		return ano;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setCodigoFilme(long codigoFilme) {
		this.codigoFilme = codigoFilme;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Filme() {
		
		
	}
}

