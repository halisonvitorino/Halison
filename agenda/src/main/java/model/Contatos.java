package model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contatos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;

	private String nome;
	private String email;
	private String telefoneFixo;
	private String telefoneCelular;
	private Date dataNascimento;
	private String empresa;
	private String cidade;
	private String sexo;
	
	public long getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public String getEmpresa() {
		return empresa;
	}
	public String getCidade() {
		return cidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
