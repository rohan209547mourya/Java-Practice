package problem2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList(
						
						"New Delhi",
						"Chandigarh",
						"Pune",
						"Mumbai",
						"Ahamdabad"
						);
		
		
		Collections.sort(list ,(l1 , l2) -> l2.compareTo(l1));
		
		System.out.println(list);
	}

}
