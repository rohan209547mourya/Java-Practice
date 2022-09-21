package question1;

public class OLA {

	public Car bookCar(int numberOfPassengers , int numberOfKms) {
		
		
		if(numberOfPassengers <= 3) {
			
			Car newCar = new HatchBack(numberOfPassengers , numberOfKms);
			
			System.out.println("Inside car 1");
			
			return newCar;
			
		}
		
		
		
		
		Car newCar = new Sedan(numberOfPassengers , numberOfKms);
		
		System.out.println("Inside car 2");
		
		return newCar;
	
	}
	

	public int calculateBill(Car car) {
		
		int kms = car.getNumberOfkms();
		
		int fare = 0;
		
		if(car.getNumberOfPassenger() <= 3) {
			
			HatchBack p = (HatchBack) car;
			
			fare =  p.FARE_PER_KM;
		}
		else {
			
			Sedan p1 = (Sedan) car;
			
			fare = p1.FARE_PER_KM;
			
		}
		
		int totalFare = kms * fare;
		
		
		return totalFare;
	}
	
}
