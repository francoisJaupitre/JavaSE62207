package edu.it.clase10.componentes;

import javax.persistence.*;

public class ConectorJPA {
	private EntityManager em;
	private EntityManagerFactory emf;
	
	public ConectorJPA() {
		emf = Persistence.createEntityManagerFactory("mariadb");
	}
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
