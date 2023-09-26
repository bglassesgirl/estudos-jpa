package br.edu.ifba.dao;

import java.util.List;

import br.edu.ifba.basicas.Categoria;
import br.edu.ifba.basicas.Cliente;
import br.edu.ifba.basicas.Empresa;
import br.edu.ifba.basicas.EmpresaCliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class EmpresaDao {
	
	EntityManager em = GetEntityManager.getJpaConnection();
	
	public void adiciona(Empresa e) {
		em.getTransaction().begin();
			em.persist(e);
		em.getTransaction().commit();	
	}
	
	public Empresa buscarEmpresaId(int id) {
		return em.find(Empresa.class, id);
	}
	
	public List<Empresa> listarEmpresa(){
		return em.createQuery("select e from Empresa e", Empresa.class).getResultList();
	}
	
	public void atualizarEmpresa(Empresa e) {
		em.getTransaction().begin();
			em.merge(e);
		em.getTransaction().commit();
	}
	
	public void removerEmpresa(Empresa e) {
		em.getTransaction().begin();
			em.remove(e);
		em.getTransaction().commit();
	}
	
//	public List<Cliente> listarClientesEmpresa(Empresa e){
//		TypedQuery<Cliente> query = em.createQuery("select c from Cliente c join c.empresa where e.empresa= :nomeempresa", Cliente.class);
//		query.setParameter("nomeempresa", e);
//		return query.getResultList();
//	}
//	
	public void ClienteEmpresa(Cliente c, Empresa e, String status) {
		EmpresaCliente eC = new EmpresaCliente(e, c, status);
		em.getTransaction().begin();
		em.merge(eC);
		em.getTransaction().commit();
		
	}
}
