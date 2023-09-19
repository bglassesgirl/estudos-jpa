package br.edu.ifba.basicas;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class EmpresaClienteID implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empresa;
	private int cliente;
	
	
	public EmpresaClienteID() {}


	public EmpresaClienteID(int empresa, int cliente) {
		super();
		this.empresa = empresa;
		this.cliente = cliente;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cliente, empresa);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpresaClienteID other = (EmpresaClienteID) obj;
		return cliente == other.cliente && empresa == other.empresa;
	}
	
	
	
	

}
