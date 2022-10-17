package com.rohan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "product.getNameQuan", query = "select p.productName, p.quantity from Product p")
@NamedQuery(name = "product.getPriceById", query = "select p.price from Product p where p.productId = :pid")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private int price;
	private int quantity;
	
	
	
	public Product() {
		
		
	}
	
	
	public int getProductId() {
		return productId;
	}






	public void setProductId(int productId) {
		this.productId = productId;
	}






	public String getProductName() {
		return productName;
	}






	public void setProductName(String productName) {
		this.productName = productName;
	}






	public int getPrice() {
		return price;
	}






	public void setPrice(int price) {
		this.price = price;
	}






	public int getQuantity() {
		return quantity;
	}






	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}






	public Product(int productId, String productName, int price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	
	
	
	
}
