package problem2;



public class Product implements Comparable<Product> {

	
	private int productId;
	private String productName;
	private int productPrice;
	
	
	public Product() {
		
		
	}
	
	public Product(int id, String name, int price) {
		
		this.productId = id;
		this.productName = name;
		this.productPrice = price;
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
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
	@Override
	public String toString() {
		
		return "Product[Product Name => " + this.productName +"Product Price => " + this.productPrice + "Product ID => " + this.productId + "]";
	}
	
	@Override
	public int compareTo(Product product) {
		
		if(this.productPrice < product.getProductPrice()) {
			
			return 1;
		}
		else if(this.productPrice > product.getProductPrice()) {
			
			return -1;
		}
		else {
			
			return 0;
		}
	}
	
	

	
}
