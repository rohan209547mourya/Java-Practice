package question4;

public class Laptop {

	private String color;
	private String companyName;
	private String name;
	private String purpose;
	private CPU cpu;
	private GraphicCard graphicCard;
	
	
	Laptop() {
		
	}
	
	Laptop(String purpose) {
		if(purpose.equalsIgnoreCase("gaming")) {
			this.color = "Black";
			this.companyName = "Asus";
			this.name = "Asus Rog Compact gaming Beast";
			this.purpose = "Gaming";
			this.cpu = new CPU("gaming");
			this.graphicCard = new GraphicCard("gaming");
		}
		else if(purpose.equalsIgnoreCase("Entertainment")) {
			
			this.color = "White";
			this.companyName = "HP";
			this.name = "HP pavillion 16";
			this.purpose = "Entertainment";
			this.cpu = new CPU("Entertainment");
			this.graphicCard = new GraphicCard("Entertainment");
		}
		else {
			
			this.color = "Silver";
			this.companyName = "Apple";
			this.name = "Apple Mac Book Air";
			this.purpose = "Business";
			this.cpu = new CPU("dsjflsd");
			this.graphicCard = new GraphicCard("jdshfkds");
		}
	}
	
	public void displayDetails() {
		System.out.println(this.color);
		System.out.println(this.companyName);
		System.out.println(this.name);
		System.out.println(this.purpose);
		cpu.displayDetails();
		graphicCard.displayDetails();
	}

}
