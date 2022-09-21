package question4;

public class GraphicCard {
	
	private String manufacturer;
	private String capacity;
	private String series;
	
	GraphicCard() {
	
		
	}
	
	
	GraphicCard(String purpose) {
		if(purpose.equalsIgnoreCase("Entertainement")) {
			this.manufacturer = "NVIDIA";
			this.capacity = "3GB";
			this.series  = "RTX 309";
		}
		else if(purpose.equalsIgnoreCase("Gaming")) {
			
			this.manufacturer = "Ryzen";
			this.capacity = "29GB";
			this.series  = "RTX 328jkj";
		}
		else {
			
			this.manufacturer = "Apple";
			this.capacity = "12GB";
			this.series  = "RTX 3yu2k";
		}
		
	}
	
	public void displayDetails() {
		System.out.println(this.capacity);
		System.out.println(this.manufacturer);
		System.out.println(this.series);
	}
	

}
