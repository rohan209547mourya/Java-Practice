package com.rohan.usecase;

import javax.persistence.EntityManager;

import com.rohan.entity.Employee;
import com.rohan.entity.SalariedEmployee;
import com.rohan.utility.GetConnection;

public class Main {
	
	public static void main(String[] args) {
		
		SalariedEmployee employee = new SalariedEmployee("Rohan Mourya", 140000, "rohan@gmail.com");
		
		EntityManager em = GetConnection.get();
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		em.getTransaction().commit();
		
		
		System.out.println("done...");
	}
}
