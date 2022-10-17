package com.rohan.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.rohan.entity.Address;
import com.rohan.entity.Customer;
import com.rohan.utilities.GetConnection;

public class Main {

	
	
	public static void main(String[] args) {
		
		
		Customer obj1 = new Customer();
		obj1.setEmail("user1@gmail.com");
		obj1.setMobileNumber("018847883478");
		obj1.setName("Ravi Kumar");
		obj1.setAddresses(new Address("Delhi", "New Delhi", "10011", "Home"));
		obj1.setAddresses(new Address("Karnataka", "Bangalore", "930439", "Office"));
		obj1.setAddresses(new Address("Hariyana", "Gurugaon", "83993", "Headquater"));
		
		
		
		
		Customer obj2 = new Customer();
		obj2.setEmail("user2@gmail.com");
		obj2.setMobileNumber("873467534");
		obj2.setName("Amit Mondal");
		obj2.setAddresses(new Address("Delhi", "New Delhi", "348832", "Office"));
		obj2.setAddresses(new Address("Bihar", "Patna", "545232", "Home"));
		obj2.setAddresses(new Address("Hariyana", "Gurugaon", "83993", "Headquater"));
		
		
//		addCustomer(obj1);
//		addCustomer(obj2);
		
		
		findCustomer(2);
	}
	
	
	public static void addCustomer(Customer customer) {
		
		EntityManager eManager = GetConnection.get();
		
		eManager.getTransaction().begin();
		
		eManager.persist(customer);
		
		eManager.getTransaction().commit();
		
		eManager.close();
	}
	
	public static void findCustomer(int cid) {
		
		
		EntityManager em =  GetConnection.get();
		
//		String jpql = "select a.city , a.state, a.pincode,a.type from emp e INNER JOIN emp_adr a ON a.cid = :id AND e.cid = :id2";
//		
//		Query resSet = em.createQuery(jpql);
//		
//		resSet.setParameter("id", cid);
//		resSet.setParameter("id2", cid);
		
//		List<Object[]> list =   resSet.getResultList();
//		
//		for(Object[] el : list) {
//			
//			System.out.println("City = " + el[0]);
//			System.out.println("state = " + el[1]);
//			System.out.println("Pincode = " + el[2]);
//			System.out.println("Type = " + el[3]);
//		}
		
		
	}
	
	
}
