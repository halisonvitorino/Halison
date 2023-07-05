package com.halisonvitorino.cadastro.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PessoaFisica implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long codigoPF;
		
		private String nome;
	    private String cpf;
	    private String email;
	    private String telefone;
	    private String cep;
	    private String uf;
	    private String cidade;
	    private String bairro;
	    private String logradouro;
	    private String complemento;
	    private String numero;
	    
		public long getCodigoPF() {
			return codigoPF;
		}
		public String getNome() {
			return nome;
		}
		public String getCpf() {
			return cpf;
		}
		public String getEmail() {
			return email;
		}
		public String getTelefone() {
			return telefone;
		}
		public String getCep() {
			return cep;
		}
		public String getUf() {
			return uf;
		}
		public String getCidade() {
			return cidade;
		}
		public String getBairro() {
			return bairro;
		}
		public String getLogradouro() {
			return logradouro;
		}
		public String getComplemento() {
			return complemento;
		}
		public String getNumero() {
			return numero;
		}
		public void setCodigoPF(long codigoPF) {
			this.codigoPF = codigoPF;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public void setUf(String uf) {
			this.uf = uf;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}	    
}

