package br.edu.ifba.basicas;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(EmpresaClienteID.class)
public class EmpresaCliente implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	
	@Id
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	private String status;
	
	public EmpresaCliente() {}

	public EmpresaCliente(String status) {
		super();
		this.status = status;
	}

	public EmpresaCliente(Empresa empresa, Cliente cliente, String status) {
		super();
		this.empresa = empresa;
		this.cliente = cliente;
		this.status = status;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
