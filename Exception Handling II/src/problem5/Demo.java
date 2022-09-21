package problem5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Product> list = Arrays.asList(
				new Product(34, "Nike", 0134, 98321),
				new Product(3243, "Puma", 5343, 3840),
				new Product(6342, "Addidas", 1633, 74223),
				new Product(4631, "Bata", 1522, 1913),
				new Product(8342748, "Jorden", 2525, 7453)
				);
		
		Collections.sort(list , (p1 , p2) -> p2.getPrice() - p1.getPrice());
		
		System.out.println(list);
	}
}
