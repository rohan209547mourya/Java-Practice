package problem4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import problem2.Student;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Set<Student> set = new HashSet<>(
				
				Arrays.asList(
						
						new Student("S1",345),
						new Student("S2",453),
						new Student("S3",538),
						new Student("S4",857),
						new Student("S5",292)
						
						)
				
				);
		
		
		Set<Student> newSet = set.stream()
								 .filter(s -> s.getMarks() < 500)
								 .collect(Collectors.toSet());
		
		
		newSet.forEach(s -> System.out.println(s));
		
	}
}
