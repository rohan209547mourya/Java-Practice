package com.rohan.utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetConnection {
	
	
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		
		
		entityManagerFactory = Persistence.createEntityManagerFactory("employee");
	}
	
	
	public static EntityManager get() {
		
		
		return entityManagerFactory.createEntityManager();
	}
}
