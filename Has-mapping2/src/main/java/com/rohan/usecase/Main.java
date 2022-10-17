package com.rohan.usecase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.rohan.entity.Product;
import com.rohan.utilities.GetConnection;

public class Main {
	
//	Write a Named Query to get the productName and quantity of all the products.
//	● Write a Named Query to get the Product Price based on the Product Id.
//	● Write a JPQL to get the Product Details based on the product Id.
//	● Write a JPQL to get the total price of all the products..
//	● Write a JPQL to get all the products whose quantity is less than 5.
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Insert =============== >>>>>>>>>>>
		
//		Product product = new Product();
//		
//		System.out.println("Enter product name: ");
//		product.setProductName(sc.nextLine());
//		
//		System.out.println("Enter product price: ");
//		product.setPrice(sc.nextInt());
//		
//		System.out.println("Enter product quantity: ");
//		product.setQuantity(sc.nextInt());
//		
//		addProduct(product);
		
		
		EntityManager eManager = GetConnection.get();
		
		
		
		
		
		
		// Named Query 1 ------------->
		
//		Query query = eManager.createNamedQuery("product.getNameQuan");
//		
//		List<Object[]> list = query.getResultList();
//		
//		
//		for(Object[] el : list) {
//			
//			System.out.println("Product Name : " + el[0]);
//			System.out.println("Product Price :" + el[1]);
//			
//			System.out.println("============================");
//		}
		
		
		
		
		
		
		
		
		
		// Named Query 2 ------------>
		
//		Query query =  eManager.createNamedQuery("product.getPriceById");
//		
//		System.out.println("Enter product id : ");
//		
//		query.setParameter("pid", sc.nextInt());
//		
//		int price = (Integer) query.getSingleResult();
//		
//		System.out.println("Price : " + price);
		
		
		
		
		
		
		// Query 3 --------------------->
		
//		Query query = eManager.createQuery("select p from Product p where productId = :id");
//		
//		System.out.println("Enter product id : ");
//		query.setParameter("id", sc.nextInt());
//		
//	 	Product product =  (Product) query.getSingleResult();
//	 	
//		System.out.println(product);
		
		
		
		
		
		// Query 4 ----------------------> 
		
//		Query query = 	eManager.createQuery("select SUM(p.price) from Product p");
//		
//		long totalPrice = (Long) query.getSingleResult();
//	
//		
//		System.out.println(totalPrice);
		
		
		
		
		
		
		
		
		
		// Query 5 --------------------->
		
		Query query = eManager.createQuery("select p from Product p where p.quantity < 5");
		
	 	List<Product> list =  query.getResultList();
	 	
	 	list.forEach(s -> System.out.println(s));
	}
	
	public static void addProduct(Product product) {
		
		EntityManager em = GetConnection.get();
		
		em.getTransaction().begin();
		
		em.persist(product);
		
		em.getTransaction().commit();
		
		System.out.println("Product added succesfully !");
		
		em.close();
	}
}
