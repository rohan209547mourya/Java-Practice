package problem2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		
		
		//Predicate
		Predicate<Integer> p1 = k -> k > 400;
		
		System.out.println(p1.test(8291));
		
		
		
		//Function 
		
		try {
		
			Function<String, Integer> f1 = input -> Integer.parseInt(input);
			
			System.out.println(f1.apply("400"));
		}
		catch(NumberFormatException el) {
			
			System.out.println(el.getMessage());
		}
		
		
		//Consumer
		
		Emp e1 = new Emp("Rohan");
		
		System.out.println(e1.getName());
		
		Consumer<Emp> c1 = s -> s.setName("Ratan");
		
		c1.accept(e1);
		
		System.out.println(e1.getName());
		
		
		//Supplier
		
		Supplier<String> s1 = () -> "Hello Java";
		
		System.out.println(s1.get());
	}
			
			
			
}
