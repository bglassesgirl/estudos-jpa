package br.edu.ifba.principal;

import br.edu.ifba.basicas.Categoria;
import br.edu.ifba.dao.GetEntityManager;
import jakarta.persistence.EntityManager;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = GetEntityManager.getJpaConnection();
		
		Categoria cat= new Categoria();
		
		cat.setDescricao("Vip 2");
		
		em.getTransaction().begin();
		
		em.persist(cat);
		
		em.getTransaction().commit();
		

	}

}
