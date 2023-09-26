package br.edu.ifba.principal;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.basicas.Categoria;
import br.edu.ifba.basicas.Cliente;
import br.edu.ifba.basicas.Empresa;
import br.edu.ifba.basicas.EmpresaCliente;
import br.edu.ifba.dao.CategoriaDao;
import br.edu.ifba.dao.ClienteDao;
import br.edu.ifba.dao.EmpresaDao;
import br.edu.ifba.dao.GetEntityManager;
import jakarta.persistence.EntityManager;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CategoriaDao cd = new CategoriaDao();
		ClienteDao cl = new ClienteDao();

		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();

		Categoria cat = new Categoria();

//		cat.setDescricao("Ativo");
//		cd.adiciona(cat);
//
//		c1.setNome("Sicrano");
//		c1.setCpf("0454631");
//		c1.setTelefone("78465431");
//
//		c2.setNome("Fulano");
//		c2.setCpf("1454631");
//		c2.setTelefone("88465431");

//		cd.removerCategoria(cd.buscarCategoriaId(1));
//		cat = cd.buscarCategoriaId(3);
//		cl.adicionaCliente(c1, cat);
//		cl.adicionaCliente(c2, cat);

//		cl.listarClientesCategoria(cd.buscarCategoriaId(3)).forEach(System.out::println);
		/*
		 * Cliente c2 = cl.buscarClienteId(2); c2.setNome("Fulano");
		 * cl.atualizarCliente(c2); cl.listarCliente().forEach(System.out::println);
		 */
        
    	Empresa a = new Empresa();
    	EmpresaDao ed = new EmpresaDao();
//		
//  	EmpresaCliente ec = new EmpresaCliente();

    	a.setNome("IFBA");
    	a.setCnpj("123456");
    	ed.adiciona(a);

//		c1 = cl.buscarClienteId(3);
//		
		EntityManager em = GetEntityManager.getJpaConnection();

//		List<Empresa> e = new ArrayList<Empresa>();	
//		List<Cliente> c = new ArrayList<Cliente>();
//		c.add(c1);

//		a = em.find(Empresa.class, 1);
//		
//		ec.setCliente(c1);
//		ec.setEmpresa(a);
//		ec.setStatus("Ativo");

//		a.setClientes(c);
//		e.add(a);
//		c1.setEmpresa(e);

//		em.getTransaction().begin();
//		em.persist(ec);
//		em.getTransaction().commit();

//		em.getTransaction().begin();
//		em.merge(c1);
//		em.getTransaction().commit();

	   System.out.print(cl.listarClientesEmpresas("IFBA"));
	}

}
