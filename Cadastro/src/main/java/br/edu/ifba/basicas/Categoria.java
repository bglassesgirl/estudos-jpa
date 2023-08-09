package br.edu.ifba.basicas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String descricao;
	
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	private List<Cliente> cliente;
	
	public Categoria(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public Categoria() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", descricao=" + descricao + ", cliente=" + cliente + "]";
	}
	
	
	

}
