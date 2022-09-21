package problem1;

public class Tiger extends Animal{
	
	public Tiger() throws AnimalException {
		
	}

	void eat() {
		
		System.out.println("Tiger is Eating");
	}
	
	
	public static void main(String[] args) {
		
		
		try {
			
			Animal t1 = new Tiger();
			
			t1.eat();
		} 
		catch (AnimalException e) {
			
			AnimalException el = new AnimalException("not now");
			
			System.out.println(el);
		}
	}
}
