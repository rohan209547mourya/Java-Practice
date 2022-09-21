package question1;

public class Bird {
		
	public void fly() {
		
		System.out.println("Bird is Flying");
	}
	
}


class Parrot extends Bird{
	public void fly() {
		
		System.out.println("I am flying");
	}
	
	public void sing() {
		
		System.out.println("I am Singing");
	}
}
