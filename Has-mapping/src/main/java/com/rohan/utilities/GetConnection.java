package com.rohan.utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetConnection {

	
	private static EntityManagerFactory emFactory;
	
	static {
		
		
		emFactory = Persistence.createEntityManagerFactory("customer-unit");
	}
	
	public static EntityManager get() {
		
		return emFactory.createEntityManager();
	}
	
}	
