package com.rohan.utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetConnection {
	
	private static EntityManagerFactory emf;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("product-unit");
	}
	
	public static EntityManager get() {
		
		return emf.createEntityManager();
	}


}
