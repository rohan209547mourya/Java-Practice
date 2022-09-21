package problem3;

public class Main {
	
	public static void main(String[] args) {
		
		
		try {
			
			X a1 = n -> Integer.parseInt(n);
			
			System.out.println(a1.convetStringToNumber("234"));
			System.out.println(a1.convetStringToNumber("hskd"));
		}
		catch(NumberFormatException el) {
			
			System.out.println(el.getMessage());
		}
		
	}
}
