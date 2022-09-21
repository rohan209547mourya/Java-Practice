package question4;

public class Parent {

	final int NUMBER;
	

	public Parent(int nUMBER) {
		super();
		NUMBER = nUMBER;
	}

	void method1() {
		
		System.out.println("Inside Method 1 of Parent.");
	}
	
	final void method2() {
		
		System.out.println("Inside Method 2 of Parent.");
	}
	
	void method3() {
		
		System.out.println("Inside Method 3 of Parent.");
	}
}
