package question1;

public class Car {

	private int numberOfPassenger;
	private int numberOfkms;
	
	public Car() {
		
	}
	
	public Car(int passengers , int kms) {
		
		super();
		
		this.numberOfkms = kms;
		
		this.numberOfPassenger = passengers;
		
	}

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

	public int getNumberOfkms() {
		return numberOfkms;
	}

	public void setNumberOfkms(int numberOfkms) {
		this.numberOfkms = numberOfkms;
	}
}
