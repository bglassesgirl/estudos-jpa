package br.edu.ifba.basicas;

import java.util.List;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Empresa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String cnpj;
	
//	@ManyToMany
//	@JoinTable(name="Empresa_Cliente")
//	private List<Cliente> clientes;
	
	public Empresa(){}

	public Empresa(String nome, String cnpj, List<Cliente> clientes) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
//		this.clientes = clientes;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

//	public List<Cliente> getClientes() {
//		return clientes;
//	}
//
//	public void setClientes(List<Cliente> clientes) {
//		this.clientes = clientes;
//	}
	
	
	
	
	

}
