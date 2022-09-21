package problem1;

public class Product {
	
	private int productId;
	private int price;
	private int quanitiy;
	private String productName;
	
	
	
	public Product() {
		
		
		
	}



	public Product(int productId, int price, int quanitiy, String productName) {
		super();
		this.productId = productId;
		this.price = price;
		this.quanitiy = quanitiy;
		this.productName = productName;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getQuanitiy() {
		return quanitiy;
	}



	public void setQuanitiy(int quanitiy) {
		this.quanitiy = quanitiy;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", price=" + price + ", quanitiy=" + quanitiy + ", productName="
				+ productName + "]";
	}
	
	
	
}
