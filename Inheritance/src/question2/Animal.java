package question2;

public class Animal {
	
	
	public void makeNoise() {
		
		System.out.println("Animal is making Noise.");
	}
	
	public void eat() {
		
		System.out.println("Animal is eating.");
	}
	
	public void walk() {
		
		System.out.println("Animal is walking.");
	}
}


class Dog extends Animal{
	
	public void makeNoise() {
		System.out.println("Barking...");
	}
}

class Cat extends Animal{
	
	public void makeNoise() {
		System.out.println("Meaw...");
		
	}
}


class Tiger extends Animal{
	
	public void makeNoise() {
		System.out.println("Raoring...");
	}
}




