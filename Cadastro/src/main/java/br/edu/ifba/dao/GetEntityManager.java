 package br.edu.ifba.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetEntityManager {
   
    private static final String JPA = "projeto-jpa";
    private static EntityManagerFactory emf;
    private static EntityManager em;
   
    public static EntityManager getJpaConnection() {
       
        if(emf == null) {
        emf = Persistence.createEntityManagerFactory(JPA);
        em = emf.createEntityManager();
            return em;
        }else {
       
            return em;
        }
       
       
    }
   

}