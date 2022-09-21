package problem2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
//	Predicate<Student> : if student marks are less than 500
//	Consumer<Student>: print the student details
//	Supplier<Student> : get the Student object with all details(roll, name ,marks)
//	Function<String, Integer> : get any number in String format and return the number in
//	Integer format.
	
	
	public static void main(String[] args) {
		
		
		Predicate<Student> p1 = x -> x.getMarks() < 500;
		
		boolean res = p1.test(new Student(43, 234, "hdslh", "jdshfdsh"));
		
		System.out.println(res);
		
		
		Consumer<Student> c1 = c -> {
			
			System.out.println(c.getName() + " " + c.getMarks() + " " + c.getRoll() + " "+  c.getAddress());
			
		};
		
		c1.accept(new Student(4343, 8343, "New Delhi", "Rohan"));
		
		
		Supplier<Student> s1 = () -> new Student(4343, 8343, "New Delhi", "Rohan");
		
		Student c = s1.get();
		
		System.out.println(c.getName() + " " + c.getMarks() + " " + c.getRoll() + " "+  c.getAddress());
		
		try {
			
			Function<String, Integer> f1 = s -> Integer.parseInt(s);
			
			System.out.println(f1.apply("4584989"));
			System.out.println(f1.apply("sdfdsk"));
			
		}
		catch(NumberFormatException el) {
			
			System.out.println(el.getMessage() + " Invalid input type!");
		}
	}
	
	
}
