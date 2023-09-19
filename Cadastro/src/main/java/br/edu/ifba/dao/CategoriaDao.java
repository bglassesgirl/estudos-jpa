package br.edu.ifba.dao;

import java.util.List;

import br.edu.ifba.basicas.Categoria;
import jakarta.persistence.EntityManager;

public class CategoriaDao {
	
	EntityManager em = GetEntityManager.getJpaConnection();
	
	public void adiciona(Categoria c) {
		
		em.getTransaction().begin();
			
			em.persist(c);
			
		em.getTransaction().commit();	
		
	}
	
	public Categoria buscarCategoriaId(int id) {
		return em.find(Categoria.class, id);
	}
	
	public List<Categoria> listarCategoria(){
		return em.createQuery("select c from Categoria c", Categoria.class).getResultList();
	}
	
	public void atualizarCategoria(Categoria c) {
		
		em.getTransaction().begin();
		
			em.merge(c);
		
		em.getTransaction().commit();
		
	}
	public void removerCategoria(Categoria c) {
		
		em.getTransaction().begin();
		
			em.remove(c);
			
		
		em.getTransaction().commit();
		
	}

}
