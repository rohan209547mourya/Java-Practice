package problem1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	
	
	public static void main(String[] args) {
		
		List<Product> list = Arrays.asList(
				
				new Product(01, 349,7, "P1"),
				new Product(11, 3443,4, "P2"),
				new Product(232, 129,9, "P3"),
				new Product(43, 4633,28, "P4"),
				new Product(21, 2321,32, "P5")
				);
		
		
		List<Product> newList = list.stream()
									.filter(s -> s.getQuanitiy() > 10)
									.collect(Collectors.toList());

//		Collections.sort(newList , (s1 , s2) -> s1.getPrice() - s2.getPrice());
		
		List<Product> sortedList = newList.stream()
										  .sorted((s1 , s2) -> s1.getPrice() - s2.getPrice())
										  .collect(Collectors.toList());
		
		
		System.out.println("Original List");
		list.forEach(n -> System.out.println(n));
		
		System.out.println("Filterd List");
		sortedList.forEach(n -> System.out.println(n));
				
	}
}	

