package question4;

public class CPU {
	
	private String manufacturer;
	private String processor;
	private double clockSpeed;
	
	CPU() {
		
	}
	
	CPU(String purpose){
		if(purpose.equalsIgnoreCase("Entertainement")) {
			this.manufacturer = "Intel";
			this.processor = "CORE i5 10th Gen";
			this.clockSpeed = 3483.23;
		}
		else if(purpose.equalsIgnoreCase("Gaming")) {
			
			this.manufacturer = "Ryzen";
			this.processor = "Ryzen 5 2910";
			this.clockSpeed = 4943.23;
		}
		else {
			
			this.manufacturer = "Apple";
			this.processor = "Apple Bionic 16";
			this.clockSpeed = 1002.23;
		}
	}
	
	public void displayDetails() {
		System.out.println(this.manufacturer);
		System.out.println(this.processor);
		System.out.println(this.clockSpeed);
	}

}
