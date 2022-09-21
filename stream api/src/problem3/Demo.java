package problem3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(
				12,3,2,35,3,1,4,54,2
				);
		
		
		List<Integer> newList = list.stream()
									.map(n -> n *n)
									.collect(Collectors.toList());
		
		
		System.out.println(newList);
	}
	
}
