package br.edu.ifba.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.basicas.Categoria;
import br.edu.ifba.basicas.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class ClienteDao {
	
	EntityManager em = GetEntityManager.getJpaConnection();
	
	public void adicionaCliente(Cliente c, Categoria cat) {
		
		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(c);
		cat.setCliente(lista);
		c.setCategoria(cat);
		
		em.getTransaction().begin();
			em.merge(cat);
		em.getTransaction().commit();
		
	}
	
	public Cliente buscarClienteId(int id) {
		return em.find(Cliente.class, id);
	}
	
	public List<Cliente> listarCliente(){
		return em.createQuery("select c from Cliente c", Cliente.class).getResultList();
	}
	
	public List<Cliente> listarClientesEmpresas(String nomeEmpresa){
		TypedQuery<Cliente> query = em.createQuery("select ed.cliente ec join ec.categoria where ec.cliente= :nomeemrpesa", Cliente.class);
		query.setParameter("nomeemrpesa", nomeEmpresa);
		return query.getResultList();
	}
	
	public void atualizarCliente(Cliente c) {
		em.getTransaction().begin();
			em.merge(c);
		em.getTransaction().commit();
		
	}
	
	public void removerCliente(Cliente c) {
		em.getTransaction().begin();
			em.remove(c);
		em.getTransaction().commit();
	
		
	}

}
