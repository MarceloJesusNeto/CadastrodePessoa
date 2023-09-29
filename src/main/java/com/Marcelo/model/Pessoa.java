package com.Marcelo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String dataDeNacimento;
	private String cpf;
	private String telefone;
	
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String dataDeNacimento, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.dataDeNacimento =dataDeNacimento;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNacimento() {
		return dataDeNacimento;
	}
	public void setDataDeNacimento(String dataDeNacimento) {
		this.dataDeNacimento = dataDeNacimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
