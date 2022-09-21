package problem3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list  = Arrays.asList(
				
				new Student(34, 343, "new Delhi", "Ravi"),
				new Student(43, 932, "Gurugaon", "Sumit"),
				new Student(24, 812, "Bihar", "Aman"),
				new Student(66, 312, "Mumbai", "Jyoti"),
				new Student(93, 1076, "Hariyana", "Rohan")
				);
		
		Stream<Employee> newList = list.stream()
									 .filter(s -> s.getMarks() > 500)
									 .map(s -> new Employee(s.getRoll(), (s.getMarks() * 1000), s.getName(), s.getAddress()));
									 
		newList.forEach(s -> System.out.println(s));
	}
}
