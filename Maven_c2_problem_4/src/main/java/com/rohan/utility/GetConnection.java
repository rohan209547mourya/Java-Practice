package com.rohan.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetConnection {

	
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("problem4-unit");
	}
	
	public static EntityManager get() {
		
		return entityManagerFactory.createEntityManager();
	}
}
